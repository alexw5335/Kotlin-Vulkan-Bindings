#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec4 colour;



layout(push_constant) uniform data {
	vec2 windowSize;
	float scale;
	vec2 offset;
	vec2 size;
	uint packedColour;
};



vec2 rectVertices[4] = vec2[](
	vec2(0, 0),
	vec2(1, 0),
	vec2(0, 1),
	vec2(1, 1)
);



void main() {
	gl_Position = vec4(2 * (offset + rectVertices[gl_VertexIndex] * size) / (windowSize * scale) - 1, 0.0, 1.0);

	colour = vec4(
		packedColour & 0xFF,
		(packedColour >> 8) & 0xFF,
		(packedColour >> 16) & 0xFF,
		packedColour >> 24
	);
}