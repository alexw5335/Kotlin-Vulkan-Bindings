#version 450
#extension GL_ARB_separate_shader_objects : enable



layout (points) in;
layout (triangle_strip, max_vertices = 4) out;

layout(location = 0) in vec4[1] size;
layout(location = 1) in uint[1] texture;
layout(location = 0) out vec2 texCoords;
layout(location = 1) out flat uint outTexture;



void main() {
	float textureWidth = size[0].x;
	float textureHeight = size[0].y;
	float width = size[0].z;
	float height = size[0].w;
	vec4 pos = gl_in[0].gl_Position;

	// Vertex 1 - top left.
	gl_Position = pos;
	texCoords = vec2(0, 0);
	EmitVertex();

	// Vertex 2 - top right.
	gl_Position = pos + vec4(width, 0, 0, 0);
	texCoords = vec2(textureWidth, 0);
	EmitVertex();

	// Vertex 3 - bottom left.
	gl_Position = pos + vec4(0, height, 0.0, 0.0);
	texCoords = vec2(0, textureHeight);
	EmitVertex();

	// Vertex 4 - bottom right.
	gl_Position = pos + vec4(width, height, 0.0, 0.0);
	texCoords = vec2(textureWidth, textureHeight);
	EmitVertex();

	outTexture = texture[0];

	EndPrimitive();
}
