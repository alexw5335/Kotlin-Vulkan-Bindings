#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(location = 0) in vec2 pos;
layout(location = 1) in vec2 texCoordsIn;
layout(location = 0) out vec2 texCoords;

layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};



void main() {
	float x = pos / screenSize;
	float y = pos / screenSize;
	gl_Position = vec4(x, y, 0.0, zoom);
	texCoords = texCoordsIn;
}