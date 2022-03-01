#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 outColour;



layout(push_constant) uniform ColourData {
	layout(offset = 32) vec4 colour;
};



void main() {
	outColour = colour;
}