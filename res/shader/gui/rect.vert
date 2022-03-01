#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 outColour;



layout(push_constant) uniform Data {
	vec2 offset;
	vec2 size;
	uint colourPacked;
};



vec2 rectVertices[4] = vec2[](
	vec2(0, 0),
	vec2(1, 0),
	vec2(0, 1),
	vec2(1, 1)
);



void main() {
	gl_Position = vec4(offset + rectVertices[gl_VertexIndex] * size, 0.0, 1.0);
	outColour = vec4(
		colourPacked & 0xFF,
		(colourPacked >> 8) & 0xFF,
		(colourPacked >> 16) & 0xFF,
		colourPacked >> 24
	) / 256;
}