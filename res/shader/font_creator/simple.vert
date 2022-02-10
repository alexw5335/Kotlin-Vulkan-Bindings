#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) out vec3 fragColour;



const float size = 0.6;



vec2 positions[4] = vec2[](
	vec2(-size, -size),
	vec2(size, -size),
	vec2(-size, size),
	vec2(size, size)
);



void main() {
	vec2 position = positions[gl_VertexIndex];

	gl_Position = vec4(position, 0.0, 1.0);

	fragColour = vec3(position.x / 2 + 0.5, position.y / 2 + 0.5, 0.5);
}