#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec2 pos;

layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / screenSize - 1, 0.0, zoom);
}