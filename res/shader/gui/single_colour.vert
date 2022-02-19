#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec2 pos;



layout(push_constant) uniform TransformData {
	vec2 windowSize;
	vec2 offset;
	float scale;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / (screenSize * scale) - 1, 0.0, 1.0);
}