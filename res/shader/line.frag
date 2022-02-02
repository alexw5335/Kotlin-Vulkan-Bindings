#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 outColour;

layout(set = 1, binding = 0) uniform ubo {
	vec4 colour;
};



void main() {
	outColour = colour;
}