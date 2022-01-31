#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec2 pos;

layout(location = 0) out int colour;

layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};

layout(set = 1, binding = 0) uniform ubo2 {
	int[128*128/32] binaryData;
};



void main() {
	gl_Position = vec4(2 * (pos + offset) / screenSize - 1, 0.0, zoom);

	colour = binaryData[gl_VertexIndex / (6 * 32)] & (1 << ((gl_VertexIndex / 6) % 32));
}