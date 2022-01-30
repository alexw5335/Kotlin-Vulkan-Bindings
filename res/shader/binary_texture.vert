#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(set = 0, binding = 0) uniform ubo {
	vec2 windowSize;
	vec2 offset;
	float zoom;
};

layout(location = 0) in vec2 position;

layout(location = 1) in vec2 texCoordsIn;

layout(location = 0) out vec2 texCoords;




void main() {
	//gl_Position = vec4(position.x / windowSize.x * 2 - 1, position.y / windowSize.y * 2 - 1, 0.0, 1.0);
	gl_Position = vec4(position.x, position.y, 0.0, 1.0);
	texCoords = texCoordsIn;
}