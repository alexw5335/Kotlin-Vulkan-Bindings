#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 pos;
layout(location = 1) in uvec2 texture;

layout(location = 0) out vec2 size;
layout(location = 1) out uvec2 textureOut;



layout(push_constant) uniform Data {
	vec2 offset;
	float scale;
};



void main() {
	gl_Position = vec4(pos + offset, 0.0, 1.0);
	size = vec2(2 * 7 * scale, 2 * 9 * scale);
	textureOut = texture;
}