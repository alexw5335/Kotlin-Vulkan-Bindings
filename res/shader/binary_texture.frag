#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 texCoords;

layout(location = 0) out vec4 outColour;

layout(binding = 0) uniform sampler2D texSampler;



void main() {
	float alpha = texture(texSampler, texCoords).r;
	outColour = vec4(alpha, alpha, alpha, alpha);
}