#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 pos;
layout(location = 1) in uvec2 texture;
layout(location = 0) out vec2 size;
layout(location = 1) out uvec2 textureOut;



layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / (screenSize * zoom) - 1, 0.0, 1.0);
	size = vec2(2 * 7 * 2, 2 * 9 * 2) / (screenSize * zoom);
	textureOut = texture;
}