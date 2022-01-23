#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 inPosition;

layout(location = 0) out vec3 fragColour;



void main() {
	gl_Position = vec4(inPosition, 0.0, 1.0);

	fragColour = vec3(inPosition.x / 2 + 0.5, inPosition.y / 2 + 0.5, 0.5);
}