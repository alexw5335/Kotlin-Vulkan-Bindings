#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 outColour;



layout(set = 1, binding = 0) uniform colourUbo {
	vec4 lineColour;
};



void main() {
	outColour = lineColour;
}