#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec2 position;

layout(location = 1) in vec2 texCoordsIn;

layout(location = 0) out vec2 texCoords;




void main() {
	gl_Position = vec4(position.x, position.y, 0.0, 1.0);
	texCoords = texCoordsIn;
}