#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(binding = 0) uniform UBO {
	vec2 windowSize;
	vec2 offset;
};

layout(binding = 1) uniform UBO2 {
	float xOffset2;
	float yOffset2;
};



layout(location = 0) in vec2 inPosition;
layout(location = 1) in vec3 inColour;

layout(location = 0) out vec3 fragColour;



void main() {
	gl_Position = vec4((inPosition + offset + vec2(xOffset2, yOffset2)) * 2 / windowSize - 1, 0.0, 1.0);

    fragColour = inColour;
}