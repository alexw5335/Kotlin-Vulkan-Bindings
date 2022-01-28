#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 outColour;

layout(location = 0) in vec2 texCoordsFrag;

layout(binding = 0) uniform sampler2D texSampler;



float median(float r, float g, float b) {
	return max(min(r, g), min(max(r, g), b));
}



void main() {
	outColour = texture(texSampler, texCoordsFrag);
	//vec3 msd = texture(texSampler, texCoordsFrag).rgb;
	//float sd = median(msd.r, msd.g, msd.b);
	//float screenPxDistance = 10.0 * (sd - 0.5);
	//float opacity = clamp(screenPxDistance + 0.5, 0.0, 1.0);
	//outColour = vec4(1.0, 1.0, 1.0, opacity);
}

//in vec2 texCoord;
//out vec4 color;
//uniform sampler2D msdf;
//uniform vec4 bgColor;
//uniform vec4 fgColor;
//
//float median(float r, float g, float b) {
//    return max(min(r, g), min(max(r, g), b));
//}
//
//void main() {
//    vec3 msd = texture(msdf, texCoord).rgb;
//    float sd = median(msd.r, msd.g, msd.b);
//    float screenPxDistance = screenPxRange()*(sd - 0.5);
//    float opacity = clamp(screenPxDistance + 0.5, 0.0, 1.0);
//    color = mix(bgColor, fgColor, opacity);
//}