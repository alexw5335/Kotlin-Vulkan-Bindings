#version 450
#extension GL_ARB_separate_shader_objects : enable


layout(set = 0, binding = 0) uniform ubo {
	vec2 windowSize;
	vec2 offset;
	float zoom;
};



layout(location = 0) out vec2 texCoords;




vec2 positions[4] = vec2[](
	vec2(-1, -1),
	vec2(1, -1),
	vec2(-1, 1),
	vec2(1, 1)
);



vec2 texCoordsArray[4] = vec2[](
	vec2(0.0, 0.0),
	vec2(1.0, 0.0),
	vec2(0.0, 1.0),
	vec2(1.0, 1.0)
);



void main() {
	vec2 pos = positions[gl_VertexIndex];
	gl_Position = vec4(((pos * vec2(windowSize.x)) / windowSize + offset / windowSize * 2) / vec2(zoom), 0.0, 1.0);
	texCoords = texCoordsArray[gl_VertexIndex];
}