#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec2 texCoords;
layout(location = 1) in flat uint64_t texture;
layout(location = 0) out vec4 outColour;



void main() {
	int index = int(texCoords.y) * 8 + int(texCoords.x);
	uint mask = 1 << index;
	uint result = texture & mask;
	outColour = vec4(result);
}