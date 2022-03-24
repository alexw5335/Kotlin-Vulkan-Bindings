#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 pos;
layout(location = 1) in uvec2 texture;

layout(location = 0) out vec2 size;
layout(location = 1) out uvec2 textureOut;
layout(location = 2) out uint packedColourOut;



layout(push_constant) uniform data {
	// alignment of 8
	vec2 windowSize;
	float scale;
	vec2 offset;
	float textScale;
	int packedColour;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / (windowSize * scale) - 1, 0.0, 1.0);
	size = vec2(2 * 7 * textScale, 2 * 9 * textScale) / (windowSize * scale);
	textureOut = texture;
	packedColourOut = packedColour;
}