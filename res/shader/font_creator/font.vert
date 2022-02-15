#version 450
#extension GL_ARB_separate_shader_objects : enable



layout(location = 0) in vec4 box;
layout(location = 1) in uint texture;
layout(location = 0) out vec4 size;
layout(location = 1) out uint textureOut;



layout(set = 0, binding = 0) uniform ubo {
	vec2 screenSize;
	vec2 offset;
	float zoom;
};



void main() {
	gl_Position = vec4(2 * (box.xy + offset) / (screenSize * zoom) - 1, 0.0, 1.0);
	size = vec4(box.z, box.w, box.z / (screenSize.x * zoom), box.w / (screenSize.y * zoom));
	textureOut = texture;
}