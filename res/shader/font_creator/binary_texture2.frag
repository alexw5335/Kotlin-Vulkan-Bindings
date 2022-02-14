#version 450
#extension GL_ARB_separate_shader_objects : enable
#extension GL_EXT_scalar_block_layout : enable



layout(location = 0) in vec2 texCoords;

layout(location = 0) out vec4 outColour;

layout(set = 1, binding = 0, std430) uniform ubo2 {
	uint[2] values;
};



void main() {
	int x = int(texCoords.x);
	int y = int(texCoords.y);
	uint index = y * 8 + x;
	uint value = uint(values[index / 32]);
	uint and = 1 << (index % 32);
	uint value2 = value & and;
	outColour = vec4(value2);
}