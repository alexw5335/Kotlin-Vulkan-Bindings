package kvb.gui

class Gui {


	/*
	Rendering
	- Rendering is recursively done from the root base.
	- Top-level components such as drop menus are rendered separately (or even natively).
	- Most vertex data will be rectangles (4 vertices * 2 floats * 4 bytes = 32 bytes). For these,
	buffer subdivision with a specialised buffer heap allocator can be used.
	- Text vertex data will usually be 16 bytes per character.
		- A single buffer of minimum alignment (256 bytes) can hold 16 characters.
		- Text should not be buffer-subdivided. Each text will have a buffer.
		- Rich text will only have a single buffer (not including other components such as underlines).
			- May have many draw calls into this buffer.
	- Base rendering will use few pipelines.
		- Single colour - triangle strip
		- Texture - triangle strip
		- Font - point list
	- Each base has a model, which handles rendering.
	- Vertex transformations are done using push constants.
		- All GUI vertex shaders have a push constant that starts with windowSize, offset, and scale.
			- Shaders can add additional vertex data after this.
			- The model sets these push constants.
		- Rendering is done from the top-down.
			- Base transformations are passed onto their children in the render function.
		- Every rendering base updates its pipeline's push constants before rendering.
		- Colours are done separately through fragment shader push constants.
		- Push constants avoid the use of descriptors for single-colour shaders
			- Descriptors are still necessary for textures.
	- Textures are updated by binding different descriptor sets.
		- Note: Uniform buffers cannot be updated during a render pass.
		- Descriptor set binding is expensive.
	- Small bit fonts do not need textures.
		- Compound glyphs can be used to create larger textures.
			- Large glyphs may cause the line height to exceed the font's size, which may need
			to be reflected in the paragraph's vertical alignment.
	- For the moment, vertex data can be linearly allocated.
		- The vertex data for most components will be persistent.
		- Only for dynamically sized text does heap allocation need to be considered.
	- Buffer sub-allocation must take alignment into account.
		- A buffer used as a vertex buffer must have an alignment equal to the size of its format.
		- For most gui vertex data this will be 8 bytes (x, y). It may be 16 bytes (1, y, u, v).
		- This is ok, alignment will be taken into account when allocating the buffer, not a creation.

		*   *  * *  *    *****
		       **   *    * * *
	   ***  *  *    *    * * *
	    *   *  *    *    * * *
	    *   *  *    *    * * *
	    *   *  **   *    * * *
	    *   *  * *  ***  * * *
	   *

	 */



	var hovered: Base? = null

	var pressed: Base? = null


}