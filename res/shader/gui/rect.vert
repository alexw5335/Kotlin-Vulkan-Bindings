#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(push_constant) uniform TransformData {
	vec2 windowSize;
	vec2 offset;
	float scale;
	vec2 rectSize;
};



vec2 rectVertices[4] = vec2[](
	vec2(0, 0),
	vec2(1, 0),
	vec2(0, 1),
	vec2(1, 1)
);



void main() {
	gl_Position = vec4(2 * (offset + rectVertices[gl_VertexIndex] * rectSize) / (windowSize * scale) - 1, 0.0, 1.0);
}