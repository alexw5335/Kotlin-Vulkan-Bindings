#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec4 posBox;
layout(location = 1) in vec4 texBox;



layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / (screenSize * zoom) - 1, 0.0, 1.0);
}