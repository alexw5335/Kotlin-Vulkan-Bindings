#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 texCoords;
layout(location = 1) flat in uvec2 texture;

layout(location = 2) flat in uint packedColour;
layout(location = 0) out vec4 outColour;



void main() {
	uint index = int(texCoords.y) * 7 + int(texCoords.x);
	uint value = texture[index / 32];
	uint mask = 1 << (index % 32);

	vec3 colour = vec3(
     	packedColour & 0xFFu,
     	(packedColour >> 8) & 0xFFu,
     	(packedColour >> 16) & 0xFFu
    ) / 256;

	outColour = vec4(colour, value & mask);
}