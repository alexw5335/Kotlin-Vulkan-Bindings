#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 texCoords;
layout(location = 1) flat in uvec2 texture;
layout(location = 0) out vec4 outColour;



void main() {
	int index = int(texCoords.y) * 8 + int(texCoords.x);
	uint value = texture[index / 32];
	uint mask = 1 << (index % 32);
	outColour = vec4(value & mask);
}