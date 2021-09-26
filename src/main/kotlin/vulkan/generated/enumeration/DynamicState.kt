// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDynamicState {
 *         VIEWPORT                         = 0
 *         SCISSOR                          = 1
 *         LINE_WIDTH                       = 2
 *         DEPTH_BIAS                       = 3
 *         BLEND_CONSTANTS                  = 4
 *         DEPTH_BOUNDS                     = 5
 *         STENCIL_COMPARE_MASK             = 6
 *         STENCIL_WRITE_MASK               = 7
 *         STENCIL_REFERENCE                = 8
 *         VIEWPORT_W_SCALING               = 1000087000
 *         DISCARD_RECTANGLE                = 1000099000
 *         SAMPLE_LOCATIONS                 = 1000143000
 *         RAY_TRACING_PIPELINE_STACK_SIZE  = 1000347000
 *         VIEWPORT_SHADING_RATE_PALETTE    = 1000164004
 *         VIEWPORT_COARSE_SAMPLE_ORDER     = 1000164006
 *         EXCLUSIVE_SCISSOR                = 1000205001
 *         FRAGMENT_SHADING_RATE            = 1000226000
 *         LINE_STIPPLE                     = 1000259000
 *         CULL_MODE                        = 1000267000
 *         FRONT_FACE                       = 1000267001
 *         PRIMITIVE_TOPOLOGY               = 1000267002
 *         VIEWPORT_WITH_COUNT              = 1000267003
 *         SCISSOR_WITH_COUNT               = 1000267004
 *         VERTEX_INPUT_BINDING_STRIDE      = 1000267005
 *         DEPTH_TEST_ENABLE                = 1000267006
 *         DEPTH_WRITE_ENABLE               = 1000267007
 *         DEPTH_COMPARE_OP                 = 1000267008
 *         DEPTH_BOUNDS_TEST_ENABLE         = 1000267009
 *         STENCIL_TEST_ENABLE              = 1000267010
 *         STENCIL_OP                       = 1000267011
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DynamicState(val id: Int) {
	
	
	val is_VIEWPORT get() = id == 0
	val is_SCISSOR get() = id == 1
	val is_LINE_WIDTH get() = id == 2
	val is_DEPTH_BIAS get() = id == 3
	val is_BLEND_CONSTANTS get() = id == 4
	val is_DEPTH_BOUNDS get() = id == 5
	val is_STENCIL_COMPARE_MASK get() = id == 6
	val is_STENCIL_WRITE_MASK get() = id == 7
	val is_STENCIL_REFERENCE get() = id == 8
	val is_VIEWPORT_W_SCALING get() = id == 1000087000
	val is_DISCARD_RECTANGLE get() = id == 1000099000
	val is_SAMPLE_LOCATIONS get() = id == 1000143000
	val is_RAY_TRACING_PIPELINE_STACK_SIZE get() = id == 1000347000
	val is_VIEWPORT_SHADING_RATE_PALETTE get() = id == 1000164004
	val is_VIEWPORT_COARSE_SAMPLE_ORDER get() = id == 1000164006
	val is_EXCLUSIVE_SCISSOR get() = id == 1000205001
	val is_FRAGMENT_SHADING_RATE get() = id == 1000226000
	val is_LINE_STIPPLE get() = id == 1000259000
	val is_CULL_MODE get() = id == 1000267000
	val is_FRONT_FACE get() = id == 1000267001
	val is_PRIMITIVE_TOPOLOGY get() = id == 1000267002
	val is_VIEWPORT_WITH_COUNT get() = id == 1000267003
	val is_SCISSOR_WITH_COUNT get() = id == 1000267004
	val is_VERTEX_INPUT_BINDING_STRIDE get() = id == 1000267005
	val is_DEPTH_TEST_ENABLE get() = id == 1000267006
	val is_DEPTH_WRITE_ENABLE get() = id == 1000267007
	val is_DEPTH_COMPARE_OP get() = id == 1000267008
	val is_DEPTH_BOUNDS_TEST_ENABLE get() = id == 1000267009
	val is_STENCIL_TEST_ENABLE get() = id == 1000267010
	val is_STENCIL_OP get() = id == 1000267011
	
	
	
	override fun toString() = when(id) {
		VIEWPORT.id -> "VIEWPORT"
		SCISSOR.id -> "SCISSOR"
		LINE_WIDTH.id -> "LINE_WIDTH"
		DEPTH_BIAS.id -> "DEPTH_BIAS"
		BLEND_CONSTANTS.id -> "BLEND_CONSTANTS"
		DEPTH_BOUNDS.id -> "DEPTH_BOUNDS"
		STENCIL_COMPARE_MASK.id -> "STENCIL_COMPARE_MASK"
		STENCIL_WRITE_MASK.id -> "STENCIL_WRITE_MASK"
		STENCIL_REFERENCE.id -> "STENCIL_REFERENCE"
		VIEWPORT_W_SCALING.id -> "VIEWPORT_W_SCALING"
		DISCARD_RECTANGLE.id -> "DISCARD_RECTANGLE"
		SAMPLE_LOCATIONS.id -> "SAMPLE_LOCATIONS"
		RAY_TRACING_PIPELINE_STACK_SIZE.id -> "RAY_TRACING_PIPELINE_STACK_SIZE"
		VIEWPORT_SHADING_RATE_PALETTE.id -> "VIEWPORT_SHADING_RATE_PALETTE"
		VIEWPORT_COARSE_SAMPLE_ORDER.id -> "VIEWPORT_COARSE_SAMPLE_ORDER"
		EXCLUSIVE_SCISSOR.id -> "EXCLUSIVE_SCISSOR"
		FRAGMENT_SHADING_RATE.id -> "FRAGMENT_SHADING_RATE"
		LINE_STIPPLE.id -> "LINE_STIPPLE"
		CULL_MODE.id -> "CULL_MODE"
		FRONT_FACE.id -> "FRONT_FACE"
		PRIMITIVE_TOPOLOGY.id -> "PRIMITIVE_TOPOLOGY"
		VIEWPORT_WITH_COUNT.id -> "VIEWPORT_WITH_COUNT"
		SCISSOR_WITH_COUNT.id -> "SCISSOR_WITH_COUNT"
		VERTEX_INPUT_BINDING_STRIDE.id -> "VERTEX_INPUT_BINDING_STRIDE"
		DEPTH_TEST_ENABLE.id -> "DEPTH_TEST_ENABLE"
		DEPTH_WRITE_ENABLE.id -> "DEPTH_WRITE_ENABLE"
		DEPTH_COMPARE_OP.id -> "DEPTH_COMPARE_OP"
		DEPTH_BOUNDS_TEST_ENABLE.id -> "DEPTH_BOUNDS_TEST_ENABLE"
		STENCIL_TEST_ENABLE.id -> "STENCIL_TEST_ENABLE"
		STENCIL_OP.id -> "STENCIL_OP"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val VIEWPORT get() = DynamicState(0)
		val SCISSOR get() = DynamicState(1)
		val LINE_WIDTH get() = DynamicState(2)
		val DEPTH_BIAS get() = DynamicState(3)
		val BLEND_CONSTANTS get() = DynamicState(4)
		val DEPTH_BOUNDS get() = DynamicState(5)
		val STENCIL_COMPARE_MASK get() = DynamicState(6)
		val STENCIL_WRITE_MASK get() = DynamicState(7)
		val STENCIL_REFERENCE get() = DynamicState(8)
		val VIEWPORT_W_SCALING get() = DynamicState(1000087000)
		val DISCARD_RECTANGLE get() = DynamicState(1000099000)
		val SAMPLE_LOCATIONS get() = DynamicState(1000143000)
		val RAY_TRACING_PIPELINE_STACK_SIZE get() = DynamicState(1000347000)
		val VIEWPORT_SHADING_RATE_PALETTE get() = DynamicState(1000164004)
		val VIEWPORT_COARSE_SAMPLE_ORDER get() = DynamicState(1000164006)
		val EXCLUSIVE_SCISSOR get() = DynamicState(1000205001)
		val FRAGMENT_SHADING_RATE get() = DynamicState(1000226000)
		val LINE_STIPPLE get() = DynamicState(1000259000)
		val CULL_MODE get() = DynamicState(1000267000)
		val FRONT_FACE get() = DynamicState(1000267001)
		val PRIMITIVE_TOPOLOGY get() = DynamicState(1000267002)
		val VIEWPORT_WITH_COUNT get() = DynamicState(1000267003)
		val SCISSOR_WITH_COUNT get() = DynamicState(1000267004)
		val VERTEX_INPUT_BINDING_STRIDE get() = DynamicState(1000267005)
		val DEPTH_TEST_ENABLE get() = DynamicState(1000267006)
		val DEPTH_WRITE_ENABLE get() = DynamicState(1000267007)
		val DEPTH_COMPARE_OP get() = DynamicState(1000267008)
		val DEPTH_BOUNDS_TEST_ENABLE get() = DynamicState(1000267009)
		val STENCIL_TEST_ENABLE get() = DynamicState(1000267010)
		val STENCIL_OP get() = DynamicState(1000267011)
	
	}


}