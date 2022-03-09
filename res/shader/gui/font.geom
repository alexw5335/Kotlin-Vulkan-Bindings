#version 450
#extension GL_ARB_separate_shader_objects : enable



layout (points) in;
layout (triangle_strip, max_vertices = 4) out;

layout(location = 0) in vec2[1] size;
layout(location = 1) in uvec2[1] texture;
layout(location = 0) out vec2 texCoords;
layout(location = 1) out uvec2 outTexture;



void main() {
	float width = size[0].x;
	float height = size[0].y;
	vec4 pos = gl_in[0].gl_Position;

	// Vertex 1 - top left.
	gl_Position = pos;
	texCoords = vec2(0, 0);
	outTexture = texture[0];
	EmitVertex();

	// Vertex 2 - top right.
	gl_Position = pos + vec4(width, 0, 0, 0);
	texCoords = vec2(7, 0);
	outTexture = texture[0];
	EmitVertex();

	// Vertex 3 - bottom left.
	gl_Position = pos + vec4(0, height, 0.0, 0.0);
	texCoords = vec2(0, 9);
	outTexture = texture[0];
	EmitVertex();

	// Vertex 4 - bottom right.
	gl_Position = pos + vec4(width, height, 0.0, 0.0);
	texCoords = vec2(7, 9);
	outTexture = texture[0];
	EmitVertex();

	EndPrimitive();
}
