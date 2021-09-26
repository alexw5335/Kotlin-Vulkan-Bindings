// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkStructureType {
 *         APPLICATION_INFO                                              = 0
 *         INSTANCE_CREATE_INFO                                          = 1
 *         DEVICE_QUEUE_CREATE_INFO                                      = 2
 *         DEVICE_CREATE_INFO                                            = 3
 *         SUBMIT_INFO                                                   = 4
 *         MEMORY_ALLOCATE_INFO                                          = 5
 *         MAPPED_MEMORY_RANGE                                           = 6
 *         BIND_SPARSE_INFO                                              = 7
 *         FENCE_CREATE_INFO                                             = 8
 *         SEMAPHORE_CREATE_INFO                                         = 9
 *         EVENT_CREATE_INFO                                             = 10
 *         QUERY_POOL_CREATE_INFO                                        = 11
 *         BUFFER_CREATE_INFO                                            = 12
 *         BUFFER_VIEW_CREATE_INFO                                       = 13
 *         IMAGE_CREATE_INFO                                             = 14
 *         IMAGE_VIEW_CREATE_INFO                                        = 15
 *         SHADER_MODULE_CREATE_INFO                                     = 16
 *         PIPELINE_CACHE_CREATE_INFO                                    = 17
 *         PIPELINE_SHADER_STAGE_CREATE_INFO                             = 18
 *         PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO                       = 19
 *         PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO                     = 20
 *         PIPELINE_TESSELLATION_STATE_CREATE_INFO                       = 21
 *         PIPELINE_VIEWPORT_STATE_CREATE_INFO                           = 22
 *         PIPELINE_RASTERIZATION_STATE_CREATE_INFO                      = 23
 *         PIPELINE_MULTISAMPLE_STATE_CREATE_INFO                        = 24
 *         PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO                      = 25
 *         PIPELINE_COLOR_BLEND_STATE_CREATE_INFO                        = 26
 *         PIPELINE_DYNAMIC_STATE_CREATE_INFO                            = 27
 *         GRAPHICS_PIPELINE_CREATE_INFO                                 = 28
 *         COMPUTE_PIPELINE_CREATE_INFO                                  = 29
 *         PIPELINE_LAYOUT_CREATE_INFO                                   = 30
 *         SAMPLER_CREATE_INFO                                           = 31
 *         DESCRIPTOR_SET_LAYOUT_CREATE_INFO                             = 32
 *         DESCRIPTOR_POOL_CREATE_INFO                                   = 33
 *         DESCRIPTOR_SET_ALLOCATE_INFO                                  = 34
 *         WRITE_DESCRIPTOR_SET                                          = 35
 *         COPY_DESCRIPTOR_SET                                           = 36
 *         FRAMEBUFFER_CREATE_INFO                                       = 37
 *         RENDER_PASS_CREATE_INFO                                       = 38
 *         COMMAND_POOL_CREATE_INFO                                      = 39
 *         COMMAND_BUFFER_ALLOCATE_INFO                                  = 40
 *         COMMAND_BUFFER_INHERITANCE_INFO                               = 41
 *         COMMAND_BUFFER_BEGIN_INFO                                     = 42
 *         RENDER_PASS_BEGIN_INFO                                        = 43
 *         BUFFER_MEMORY_BARRIER                                         = 44
 *         IMAGE_MEMORY_BARRIER                                          = 45
 *         MEMORY_BARRIER                                                = 46
 *         LOADER_INSTANCE_CREATE_INFO                                   = 47
 *         LOADER_DEVICE_CREATE_INFO                                     = 48
 *         PHYSICAL_DEVICE_SUBGROUP_PROPERTIES                           = 1000094000
 *         BIND_BUFFER_MEMORY_INFO                                       = 1000157000
 *         BIND_IMAGE_MEMORY_INFO                                        = 1000157001
 *         PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES                        = 1000083000
 *         MEMORY_DEDICATED_REQUIREMENTS                                 = 1000127000
 *         MEMORY_DEDICATED_ALLOCATE_INFO                                = 1000127001
 *         MEMORY_ALLOCATE_FLAGS_INFO                                    = 1000060000
 *         DEVICE_GROUP_RENDER_PASS_BEGIN_INFO                           = 1000060003
 *         DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO                        = 1000060004
 *         DEVICE_GROUP_SUBMIT_INFO                                      = 1000060005
 *         DEVICE_GROUP_BIND_SPARSE_INFO                                 = 1000060006
 *         BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO                          = 1000060013
 *         BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO                           = 1000060014
 *         PHYSICAL_DEVICE_GROUP_PROPERTIES                              = 1000070000
 *         DEVICE_GROUP_DEVICE_CREATE_INFO                               = 1000070001
 *         BUFFER_MEMORY_REQUIREMENTS_INFO_2                             = 1000146000
 *         IMAGE_MEMORY_REQUIREMENTS_INFO_2                              = 1000146001
 *         IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2                       = 1000146002
 *         MEMORY_REQUIREMENTS_2                                         = 1000146003
 *         SPARSE_IMAGE_MEMORY_REQUIREMENTS_2                            = 1000146004
 *         PHYSICAL_DEVICE_FEATURES_2                                    = 1000059000
 *         PHYSICAL_DEVICE_PROPERTIES_2                                  = 1000059001
 *         FORMAT_PROPERTIES_2                                           = 1000059002
 *         IMAGE_FORMAT_PROPERTIES_2                                     = 1000059003
 *         PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2                           = 1000059004
 *         QUEUE_FAMILY_PROPERTIES_2                                     = 1000059005
 *         PHYSICAL_DEVICE_MEMORY_PROPERTIES_2                           = 1000059006
 *         SPARSE_IMAGE_FORMAT_PROPERTIES_2                              = 1000059007
 *         PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2                    = 1000059008
 *         PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES                     = 1000117000
 *         RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO               = 1000117001
 *         IMAGE_VIEW_USAGE_CREATE_INFO                                  = 1000117002
 *         PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO         = 1000117003
 *         RENDER_PASS_MULTIVIEW_CREATE_INFO                             = 1000053000
 *         PHYSICAL_DEVICE_MULTIVIEW_FEATURES                            = 1000053001
 *         PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES                          = 1000053002
 *         PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES                    = 1000120000
 *         PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES                     = 1000120000
 *         PROTECTED_SUBMIT_INFO                                         = 1000145000
 *         PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES                     = 1000145001
 *         PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES                   = 1000145002
 *         DEVICE_QUEUE_INFO_2                                           = 1000145003
 *         SAMPLER_YCBCR_CONVERSION_CREATE_INFO                          = 1000156000
 *         SAMPLER_YCBCR_CONVERSION_INFO                                 = 1000156001
 *         BIND_IMAGE_PLANE_MEMORY_INFO                                  = 1000156002
 *         IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO                          = 1000156003
 *         PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES             = 1000156004
 *         SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES              = 1000156005
 *         DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO                        = 1000085000
 *         PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO                    = 1000071000
 *         EXTERNAL_IMAGE_FORMAT_PROPERTIES                              = 1000071001
 *         PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO                          = 1000071002
 *         EXTERNAL_BUFFER_PROPERTIES                                    = 1000071003
 *         PHYSICAL_DEVICE_ID_PROPERTIES                                 = 1000071004
 *         EXTERNAL_MEMORY_BUFFER_CREATE_INFO                            = 1000072000
 *         EXTERNAL_MEMORY_IMAGE_CREATE_INFO                             = 1000072001
 *         EXPORT_MEMORY_ALLOCATE_INFO                                   = 1000072002
 *         PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO                           = 1000112000
 *         EXTERNAL_FENCE_PROPERTIES                                     = 1000112001
 *         EXPORT_FENCE_CREATE_INFO                                      = 1000113000
 *         EXPORT_SEMAPHORE_CREATE_INFO                                  = 1000077000
 *         PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO                       = 1000076000
 *         EXTERNAL_SEMAPHORE_PROPERTIES                                 = 1000076001
 *         PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES                      = 1000168000
 *         DESCRIPTOR_SET_LAYOUT_SUPPORT                                 = 1000168001
 *         PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES               = 1000063000
 *         PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES                = 1000063000
 *         PHYSICAL_DEVICE_VULKAN_1_1_FEATURES                           = 49
 *         PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES                         = 50
 *         PHYSICAL_DEVICE_VULKAN_1_2_FEATURES                           = 51
 *         PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES                         = 52
 *         IMAGE_FORMAT_LIST_CREATE_INFO                                 = 1000147000
 *         ATTACHMENT_DESCRIPTION_2                                      = 1000109000
 *         ATTACHMENT_REFERENCE_2                                        = 1000109001
 *         SUBPASS_DESCRIPTION_2                                         = 1000109002
 *         SUBPASS_DEPENDENCY_2                                          = 1000109003
 *         RENDER_PASS_CREATE_INFO_2                                     = 1000109004
 *         SUBPASS_BEGIN_INFO                                            = 1000109005
 *         SUBPASS_END_INFO                                              = 1000109006
 *         PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES                         = 1000177000
 *         PHYSICAL_DEVICE_DRIVER_PROPERTIES                             = 1000196000
 *         PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES                  = 1000180000
 *         PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES                  = 1000082000
 *         PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES                     = 1000197000
 *         DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO               = 1000161000
 *         PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES                  = 1000161001
 *         PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES                = 1000161002
 *         DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO        = 1000161003
 *         DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT       = 1000161004
 *         PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES              = 1000199000
 *         SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE                     = 1000199001
 *         PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES                  = 1000221000
 *         IMAGE_STENCIL_USAGE_CREATE_INFO                               = 1000246000
 *         PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES              = 1000130000
 *         SAMPLER_REDUCTION_MODE_CREATE_INFO                            = 1000130001
 *         PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES                  = 1000211000
 *         PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES                = 1000108000
 *         FRAMEBUFFER_ATTACHMENTS_CREATE_INFO                           = 1000108001
 *         FRAMEBUFFER_ATTACHMENT_IMAGE_INFO                             = 1000108002
 *         RENDER_PASS_ATTACHMENT_BEGIN_INFO                             = 1000108003
 *         PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES       = 1000253000
 *         PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES       = 1000175000
 *         PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES       = 1000241000
 *         ATTACHMENT_REFERENCE_STENCIL_LAYOUT                           = 1000241001
 *         ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT                         = 1000241002
 *         PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES                     = 1000261000
 *         PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES                   = 1000207000
 *         PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES                 = 1000207001
 *         SEMAPHORE_TYPE_CREATE_INFO                                    = 1000207002
 *         TIMELINE_SEMAPHORE_SUBMIT_INFO                                = 1000207003
 *         SEMAPHORE_WAIT_INFO                                           = 1000207004
 *         SEMAPHORE_SIGNAL_INFO                                         = 1000207005
 *         PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES                = 1000257000
 *         BUFFER_DEVICE_ADDRESS_INFO                                    = 1000244001
 *         BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO                     = 1000257002
 *         MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO                   = 1000257003
 *         DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO                     = 1000257004
 *         SWAPCHAIN_CREATE_INFO                                         = 1000001000
 *         PRESENT_INFO                                                  = 1000001001
 *         DEVICE_GROUP_PRESENT_CAPABILITIES                             = 1000060007
 *         IMAGE_SWAPCHAIN_CREATE_INFO                                   = 1000060008
 *         BIND_IMAGE_MEMORY_SWAPCHAIN_INFO                              = 1000060009
 *         ACQUIRE_NEXT_IMAGE_INFO                                       = 1000060010
 *         DEVICE_GROUP_PRESENT_INFO                                     = 1000060011
 *         DEVICE_GROUP_SWAPCHAIN_CREATE_INFO                            = 1000060012
 *         DISPLAY_MODE_CREATE_INFO                                      = 1000002000
 *         DISPLAY_SURFACE_CREATE_INFO                                   = 1000002001
 *         DISPLAY_PRESENT_INFO                                          = 1000003000
 *         XLIB_SURFACE_CREATE_INFO                                      = 1000004000
 *         XCB_SURFACE_CREATE_INFO                                       = 1000005000
 *         WAYLAND_SURFACE_CREATE_INFO                                   = 1000006000
 *         ANDROID_SURFACE_CREATE_INFO                                   = 1000008000
 *         WIN32_SURFACE_CREATE_INFO                                     = 1000009000
 *         DEBUG_REPORT_CALLBACK_CREATE_INFO                             = 1000011000
 *         DEBUG_REPORT_CREATE_INFO                                      = 1000011000
 *         PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER              = 1000018000
 *         DEBUG_MARKER_OBJECT_NAME_INFO                                 = 1000022000
 *         DEBUG_MARKER_OBJECT_TAG_INFO                                  = 1000022001
 *         DEBUG_MARKER_MARKER_INFO                                      = 1000022002
 *         DEDICATED_ALLOCATION_IMAGE_CREATE_INFO                        = 1000026000
 *         DEDICATED_ALLOCATION_BUFFER_CREATE_INFO                       = 1000026001
 *         DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO                     = 1000026002
 *         PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES                   = 1000028000
 *         PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES                 = 1000028001
 *         PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO               = 1000028002
 *         IMAGE_VIEW_HANDLE_INFO                                        = 1000030000
 *         IMAGE_VIEW_ADDRESS_PROPERTIES                                 = 1000030001
 *         TEXTURE_LOD_GATHER_FORMAT_PROPERTIES                          = 1000041000
 *         STREAM_DESCRIPTOR_SURFACE_CREATE_INFO                         = 1000049000
 *         PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES                 = 1000050000
 *         RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR                         = 1000053000
 *         PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR                        = 1000053001
 *         PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR                      = 1000053002
 *         EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV                          = 1000056000
 *         EXPORT_MEMORY_ALLOCATE_INFO_NV                                = 1000056001
 *         IMPORT_MEMORY_WIN32_HANDLE_INFO                               = 1000057000
 *         EXPORT_MEMORY_WIN32_HANDLE_INFO                               = 1000057001
 *         WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO                        = 1000058000
 *         PHYSICAL_DEVICE_FEATURES_2_KHR                                = 1000059000
 *         PHYSICAL_DEVICE_PROPERTIES_2_KHR                              = 1000059001
 *         FORMAT_PROPERTIES_2_KHR                                       = 1000059002
 *         IMAGE_FORMAT_PROPERTIES_2_KHR                                 = 1000059003
 *         PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR                       = 1000059004
 *         QUEUE_FAMILY_PROPERTIES_2_KHR                                 = 1000059005
 *         PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR                       = 1000059006
 *         SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR                          = 1000059007
 *         PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR                = 1000059008
 *         MEMORY_ALLOCATE_FLAGS_INFO_KHR                                = 1000060000
 *         DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR                       = 1000060003
 *         DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR                    = 1000060004
 *         DEVICE_GROUP_SUBMIT_INFO_KHR                                  = 1000060005
 *         DEVICE_GROUP_BIND_SPARSE_INFO_KHR                             = 1000060006
 *         BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR                      = 1000060013
 *         BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR                       = 1000060014
 *         VALIDATION_FLAGS                                              = 1000061000
 *         VI_SURFACE_CREATE_INFO                                        = 1000062000
 *         PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES         = 1000066000
 *         IMAGE_VIEW_ASTC_DECODE_MODE                                   = 1000067000
 *         PHYSICAL_DEVICE_ASTC_DECODE_FEATURES                          = 1000067001
 *         PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR                          = 1000070000
 *         DEVICE_GROUP_DEVICE_CREATE_INFO_KHR                           = 1000070001
 *         PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR                = 1000071000
 *         EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR                          = 1000071001
 *         PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR                      = 1000071002
 *         EXTERNAL_BUFFER_PROPERTIES_KHR                                = 1000071003
 *         PHYSICAL_DEVICE_ID_PROPERTIES_KHR                             = 1000071004
 *         EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR                        = 1000072000
 *         EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR                         = 1000072001
 *         EXPORT_MEMORY_ALLOCATE_INFO_KHR                               = 1000072002
 *         IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR                           = 1000073000
 *         EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR                           = 1000073001
 *         MEMORY_WIN32_HANDLE_PROPERTIES                                = 1000073002
 *         MEMORY_GET_WIN32_HANDLE_INFO                                  = 1000073003
 *         IMPORT_MEMORY_FD_INFO                                         = 1000074000
 *         MEMORY_FD_PROPERTIES                                          = 1000074001
 *         MEMORY_GET_FD_INFO                                            = 1000074002
 *         WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR                    = 1000075000
 *         PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR                   = 1000076000
 *         EXTERNAL_SEMAPHORE_PROPERTIES_KHR                             = 1000076001
 *         EXPORT_SEMAPHORE_CREATE_INFO_KHR                              = 1000077000
 *         IMPORT_SEMAPHORE_WIN32_HANDLE_INFO                            = 1000078000
 *         EXPORT_SEMAPHORE_WIN32_HANDLE_INFO                            = 1000078001
 *         D3D12_FENCE_SUBMIT_INFO                                       = 1000078002
 *         SEMAPHORE_GET_WIN32_HANDLE_INFO                               = 1000078003
 *         IMPORT_SEMAPHORE_FD_INFO                                      = 1000079000
 *         SEMAPHORE_GET_FD_INFO                                         = 1000079001
 *         PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES                    = 1000080000
 *         COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO         = 1000081000
 *         PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES                = 1000081001
 *         CONDITIONAL_RENDERING_BEGIN_INFO                              = 1000081002
 *         PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR              = 1000082000
 *         PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES                         = 1000082000
 *         PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR                    = 1000083000
 *         PRESENT_REGIONS                                               = 1000084000
 *         DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR                    = 1000085000
 *         PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO                 = 1000087000
 *         SURFACE_CAPABILITIES_2                                        = 1000090000
 *         SURFACE_CAPABILITIES2                                         = 1000090000
 *         DISPLAY_POWER_INFO                                            = 1000091000
 *         DEVICE_EVENT_INFO                                             = 1000091001
 *         DISPLAY_EVENT_INFO                                            = 1000091002
 *         SWAPCHAIN_COUNTER_CREATE_INFO                                 = 1000091003
 *         PRESENT_TIMES_INFO                                            = 1000092000
 *         PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES      = 1000097000
 *         PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO                   = 1000098000
 *         PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES                  = 1000099000
 *         PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO                  = 1000099001
 *         PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES         = 1000101000
 *         PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO         = 1000101001
 *         PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES                    = 1000102000
 *         PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO           = 1000102001
 *         HDR_METADATA                                                  = 1000105000
 *         PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR            = 1000108000
 *         FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR                       = 1000108001
 *         FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR                         = 1000108002
 *         RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR                         = 1000108003
 *         ATTACHMENT_DESCRIPTION_2_KHR                                  = 1000109000
 *         ATTACHMENT_REFERENCE_2_KHR                                    = 1000109001
 *         SUBPASS_DESCRIPTION_2_KHR                                     = 1000109002
 *         SUBPASS_DEPENDENCY_2_KHR                                      = 1000109003
 *         RENDER_PASS_CREATE_INFO_2_KHR                                 = 1000109004
 *         SUBPASS_BEGIN_INFO_KHR                                        = 1000109005
 *         SUBPASS_END_INFO_KHR                                          = 1000109006
 *         SHARED_PRESENT_SURFACE_CAPABILITIES                           = 1000111000
 *         PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR                       = 1000112000
 *         EXTERNAL_FENCE_PROPERTIES_KHR                                 = 1000112001
 *         EXPORT_FENCE_CREATE_INFO_KHR                                  = 1000113000
 *         IMPORT_FENCE_WIN32_HANDLE_INFO                                = 1000114000
 *         EXPORT_FENCE_WIN32_HANDLE_INFO                                = 1000114001
 *         FENCE_GET_WIN32_HANDLE_INFO                                   = 1000114002
 *         IMPORT_FENCE_FD_INFO                                          = 1000115000
 *         FENCE_GET_FD_INFO                                             = 1000115001
 *         PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES                    = 1000116000
 *         PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES                  = 1000116001
 *         QUERY_POOL_PERFORMANCE_CREATE_INFO                            = 1000116002
 *         PERFORMANCE_QUERY_SUBMIT_INFO                                 = 1000116003
 *         ACQUIRE_PROFILING_LOCK_INFO                                   = 1000116004
 *         PERFORMANCE_COUNTER                                           = 1000116005
 *         PERFORMANCE_COUNTER_DESCRIPTION                               = 1000116006
 *         PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR                 = 1000117000
 *         RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR           = 1000117001
 *         IMAGE_VIEW_USAGE_CREATE_INFO_KHR                              = 1000117002
 *         PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR     = 1000117003
 *         PHYSICAL_DEVICE_SURFACE_INFO_2                                = 1000119000
 *         SURFACE_CAPABILITIES_2_KHR                                    = 1000119001
 *         SURFACE_FORMAT_2                                              = 1000119002
 *         PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR                = 1000120000
 *         PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR                 = 1000120000
 *         DISPLAY_PROPERTIES_2                                          = 1000121000
 *         DISPLAY_PLANE_PROPERTIES_2                                    = 1000121001
 *         DISPLAY_MODE_PROPERTIES_2                                     = 1000121002
 *         DISPLAY_PLANE_INFO_2                                          = 1000121003
 *         DISPLAY_PLANE_CAPABILITIES_2                                  = 1000121004
 *         IOS_SURFACE_CREATE_INFO                                       = 1000122000
 *         MACOS_SURFACE_CREATE_INFO                                     = 1000123000
 *         MEMORY_DEDICATED_REQUIREMENTS_KHR                             = 1000127000
 *         MEMORY_DEDICATED_ALLOCATE_INFO_KHR                            = 1000127001
 *         DEBUG_UTILS_OBJECT_NAME_INFO                                  = 1000128000
 *         DEBUG_UTILS_OBJECT_TAG_INFO                                   = 1000128001
 *         DEBUG_UTILS_LABEL                                             = 1000128002
 *         DEBUG_UTILS_MESSENGER_CALLBACK_DATA                           = 1000128003
 *         DEBUG_UTILS_MESSENGER_CREATE_INFO                             = 1000128004
 *         ANDROID_HARDWARE_BUFFER_USAGE                                 = 1000129000
 *         ANDROID_HARDWARE_BUFFER_PROPERTIES                            = 1000129001
 *         ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES                     = 1000129002
 *         IMPORT_ANDROID_HARDWARE_BUFFER_INFO                           = 1000129003
 *         MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO                       = 1000129004
 *         EXTERNAL_FORMAT                                               = 1000129005
 *         PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT          = 1000130000
 *         SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT                        = 1000130001
 *         PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES                 = 1000138000
 *         PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES               = 1000138001
 *         WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK                     = 1000138002
 *         DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO              = 1000138003
 *         SAMPLE_LOCATIONS_INFO                                         = 1000143000
 *         RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO                       = 1000143001
 *         PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO                   = 1000143002
 *         PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES                   = 1000143003
 *         MULTISAMPLE_PROPERTIES                                        = 1000143004
 *         BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR                         = 1000146000
 *         IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR                          = 1000146001
 *         IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR                   = 1000146002
 *         MEMORY_REQUIREMENTS_2_KHR                                     = 1000146003
 *         SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR                        = 1000146004
 *         IMAGE_FORMAT_LIST_CREATE_INFO_KHR                             = 1000147000
 *         PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES             = 1000148000
 *         PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES           = 1000148001
 *         PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO               = 1000148002
 *         PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO                  = 1000149000
 *         WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE                   = 1000150007
 *         ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO                    = 1000150000
 *         ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO                    = 1000150002
 *         ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA                    = 1000150003
 *         ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA                = 1000150004
 *         ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA                = 1000150005
 *         ACCELERATION_STRUCTURE_GEOMETRY                               = 1000150006
 *         ACCELERATION_STRUCTURE_VERSION_INFO                           = 1000150009
 *         COPY_ACCELERATION_STRUCTURE_INFO                              = 1000150010
 *         COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO                    = 1000150011
 *         COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO                    = 1000150012
 *         PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES               = 1000150013
 *         PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES             = 1000150014
 *         ACCELERATION_STRUCTURE_CREATE_INFO                            = 1000150017
 *         ACCELERATION_STRUCTURE_BUILD_SIZES_INFO                       = 1000150020
 *         PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES                 = 1000347000
 *         PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES               = 1000347001
 *         RAY_TRACING_PIPELINE_CREATE_INFO                              = 1000150015
 *         RAY_TRACING_SHADER_GROUP_CREATE_INFO                          = 1000150016
 *         RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO                    = 1000150018
 *         PHYSICAL_DEVICE_RAY_QUERY_FEATURES                            = 1000348013
 *         PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO                = 1000152000
 *         PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES                   = 1000154000
 *         PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES                 = 1000154001
 *         SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR                      = 1000156000
 *         SAMPLER_YCBCR_CONVERSION_INFO_KHR                             = 1000156001
 *         BIND_IMAGE_PLANE_MEMORY_INFO_KHR                              = 1000156002
 *         IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR                      = 1000156003
 *         PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR         = 1000156004
 *         SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR          = 1000156005
 *         BIND_BUFFER_MEMORY_INFO_KHR                                   = 1000157000
 *         BIND_IMAGE_MEMORY_INFO_KHR                                    = 1000157001
 *         DRM_FORMAT_MODIFIER_PROPERTIES_LIST                           = 1000158000
 *         PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO                = 1000158002
 *         IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO                    = 1000158003
 *         IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO                = 1000158004
 *         IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES                          = 1000158005
 *         VALIDATION_CACHE_CREATE_INFO                                  = 1000160000
 *         SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO                    = 1000160001
 *         DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT           = 1000161000
 *         PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT              = 1000161001
 *         PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT            = 1000161002
 *         DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT    = 1000161003
 *         DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT   = 1000161004
 *         PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES                   = 1000163000
 *         PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES                 = 1000163001
 *         PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO        = 1000164000
 *         PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES                   = 1000164001
 *         PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES                 = 1000164002
 *         PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO       = 1000164005
 *         RAY_TRACING_PIPELINE_CREATE_INFO_NV                           = 1000165000
 *         ACCELERATION_STRUCTURE_CREATE_INFO_NV                         = 1000165001
 *         GEOMETRY                                                      = 1000165003
 *         GEOMETRY_TRIANGLES                                            = 1000165004
 *         GEOMETRY_AABB                                                 = 1000165005
 *         BIND_ACCELERATION_STRUCTURE_MEMORY_INFO                       = 1000165006
 *         WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV                = 1000165007
 *         ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO               = 1000165008
 *         PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES                        = 1000165009
 *         RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV                       = 1000165011
 *         ACCELERATION_STRUCTURE_INFO                                   = 1000165012
 *         PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES         = 1000166000
 *         PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO       = 1000166001
 *         PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR                  = 1000168000
 *         DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR                             = 1000168001
 *         PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO                  = 1000170000
 *         FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES               = 1000170001
 *         DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO                      = 1000174000
 *         PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR   = 1000175000
 *         PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR                     = 1000177000
 *         IMPORT_MEMORY_HOST_POINTER_INFO                               = 1000178000
 *         MEMORY_HOST_POINTER_PROPERTIES                                = 1000178001
 *         PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES               = 1000178002
 *         PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR              = 1000180000
 *         PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES                         = 1000181000
 *         PIPELINE_COMPILER_CONTROL_CREATE_INFO                         = 1000183000
 *         CALIBRATED_TIMESTAMP_INFO                                     = 1000184000
 *         PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES                        = 1000185000
 *         DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO                      = 1000189000
 *         PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES           = 1000190000
 *         PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO               = 1000190001
 *         PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES             = 1000190002
 *         PRESENT_FRAME_TOKEN                                           = 1000191000
 *         PIPELINE_CREATION_FEEDBACK_CREATE_INFO                        = 1000192000
 *         PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR                         = 1000196000
 *         PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR                 = 1000197000
 *         PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR          = 1000199000
 *         SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR                 = 1000199001
 *         PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES           = 1000201000
 *         PHYSICAL_DEVICE_MESH_SHADER_FEATURES                          = 1000202000
 *         PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES                        = 1000202001
 *         PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES          = 1000203000
 *         PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES               = 1000204000
 *         PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO         = 1000205000
 *         PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES                    = 1000205002
 *         CHECKPOINT_DATA                                               = 1000206000
 *         QUEUE_FAMILY_CHECKPOINT_PROPERTIES                            = 1000206001
 *         PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR               = 1000207000
 *         PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR             = 1000207001
 *         SEMAPHORE_TYPE_CREATE_INFO_KHR                                = 1000207002
 *         TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR                            = 1000207003
 *         SEMAPHORE_WAIT_INFO_KHR                                       = 1000207004
 *         SEMAPHORE_SIGNAL_INFO_KHR                                     = 1000207005
 *         PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES           = 1000209000
 *         QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO                      = 1000210000
 *         QUERY_POOL_CREATE_INFO_INTEL                                  = 1000210000
 *         INITIALIZE_PERFORMANCE_API_INFO                               = 1000210001
 *         PERFORMANCE_MARKER_INFO                                       = 1000210002
 *         PERFORMANCE_STREAM_MARKER_INFO                                = 1000210003
 *         PERFORMANCE_OVERRIDE_INFO                                     = 1000210004
 *         PERFORMANCE_CONFIGURATION_ACQUIRE_INFO                        = 1000210005
 *         PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR              = 1000211000
 *         PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES                       = 1000212000
 *         DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES                       = 1000213000
 *         SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO                      = 1000213001
 *         IMAGEPIPE_SURFACE_CREATE_INFO                                 = 1000214000
 *         PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES          = 1000215000
 *         METAL_SURFACE_CREATE_INFO                                     = 1000217000
 *         PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES                 = 1000218000
 *         PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES               = 1000218001
 *         RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO                  = 1000218002
 *         PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT              = 1000221000
 *         PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES              = 1000225000
 *         PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO      = 1000225001
 *         PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES                = 1000225002
 *         FRAGMENT_SHADING_RATE_ATTACHMENT_INFO                         = 1000226000
 *         PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO              = 1000226001
 *         PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES              = 1000226002
 *         PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES                = 1000226003
 *         PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE                         = 1000226004
 *         PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2                      = 1000227000
 *         PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES                      = 1000229000
 *         PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES            = 1000234000
 *         PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES                      = 1000237000
 *         PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES                      = 1000238000
 *         MEMORY_PRIORITY_ALLOCATE_INFO                                 = 1000238001
 *         SURFACE_PROTECTED_CAPABILITIES                                = 1000239000
 *         PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES  = 1000240000
 *         PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR   = 1000241000
 *         ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR                       = 1000241001
 *         ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR                     = 1000241002
 *         PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT            = 1000244000
 *         PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES                       = 1000244000
 *         BUFFER_DEVICE_ADDRESS_INFO_EXT                                = 1000244001
 *         BUFFER_DEVICE_ADDRESS_CREATE_INFO                             = 1000244002
 *         PHYSICAL_DEVICE_TOOL_PROPERTIES                               = 1000245000
 *         IMAGE_STENCIL_USAGE_CREATE_INFO_EXT                           = 1000246000
 *         VALIDATION_FEATURES                                           = 1000247000
 *         PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES                   = 1000249000
 *         COOPERATIVE_MATRIX_PROPERTIES                                 = 1000249001
 *         PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES                 = 1000249002
 *         PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES              = 1000250000
 *         PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO                 = 1000250001
 *         FRAMEBUFFER_MIXED_SAMPLES_COMBINATION                         = 1000250002
 *         PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES            = 1000251000
 *         PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES                   = 1000252000
 *         PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR   = 1000253000
 *         SURFACE_FULL_SCREEN_EXCLUSIVE_INFO                            = 1000255000
 *         SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE                    = 1000255002
 *         SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO                      = 1000255001
 *         HEADLESS_SURFACE_CREATE_INFO                                  = 1000256000
 *         PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR            = 1000257000
 *         BUFFER_DEVICE_ADDRESS_INFO_KHR                                = 1000244001
 *         BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR                 = 1000257002
 *         MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR               = 1000257003
 *         DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR                 = 1000257004
 *         PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES                   = 1000259000
 *         PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO                 = 1000259001
 *         PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES                 = 1000259002
 *         PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES                  = 1000260000
 *         PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT                 = 1000261000
 *         PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES                     = 1000265000
 *         PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES               = 1000267000
 *         PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES       = 1000269000
 *         PIPELINE_INFO                                                 = 1000269001
 *         PIPELINE_EXECUTABLE_PROPERTIES                                = 1000269002
 *         PIPELINE_EXECUTABLE_INFO                                      = 1000269003
 *         PIPELINE_EXECUTABLE_STATISTIC                                 = 1000269004
 *         PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION                   = 1000269005
 *         PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES   = 1000276000
 *         PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES          = 1000277000
 *         GRAPHICS_SHADER_GROUP_CREATE_INFO                             = 1000277001
 *         GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO                   = 1000277002
 *         INDIRECT_COMMANDS_LAYOUT_TOKEN                                = 1000277003
 *         INDIRECT_COMMANDS_LAYOUT_CREATE_INFO                          = 1000277004
 *         GENERATED_COMMANDS_INFO                                       = 1000277005
 *         GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO                   = 1000277006
 *         PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES            = 1000277007
 *         PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES               = 1000281000
 *         PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES             = 1000281001
 *         COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO         = 1000282000
 *         RENDER_PASS_TRANSFORM_BEGIN_INFO                              = 1000282001
 *         PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES                 = 1000284000
 *         DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO                       = 1000284001
 *         DEVICE_MEMORY_REPORT_CALLBACK_DATA                            = 1000284002
 *         PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES                         = 1000286000
 *         PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES                       = 1000286001
 *         SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO                       = 1000287000
 *         PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES                = 1000287001
 *         PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES                  = 1000287002
 *         PIPELINE_LIBRARY_CREATE_INFO                                  = 1000290000
 *         PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES                         = 1000295000
 *         DEVICE_PRIVATE_DATA_CREATE_INFO                               = 1000295001
 *         PRIVATE_DATA_SLOT_CREATE_INFO                                 = 1000295002
 *         PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES      = 1000297000
 *         PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES                   = 1000300000
 *         DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO                         = 1000300001
 *         MEMORY_BARRIER_2                                              = 1000314000
 *         BUFFER_MEMORY_BARRIER_2                                       = 1000314001
 *         IMAGE_MEMORY_BARRIER_2                                        = 1000314002
 *         DEPENDENCY_INFO                                               = 1000314003
 *         SUBMIT_INFO_2                                                 = 1000314004
 *         SEMAPHORE_SUBMIT_INFO                                         = 1000314005
 *         COMMAND_BUFFER_SUBMIT_INFO                                    = 1000314006
 *         PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES                    = 1000314007
 *         QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2                          = 1000314008
 *         CHECKPOINT_DATA_2                                             = 1000314009
 *         PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES     = 1000325000
 *         PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES        = 1000326000
 *         PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES          = 1000326001
 *         PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO         = 1000326002
 *         PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES               = 1000332000
 *         PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES             = 1000332001
 *         COPY_COMMAND_TRANSFORM_INFO                                   = 1000333000
 *         PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES                     = 1000335000
 *         PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES     = 1000336000
 *         COPY_BUFFER_INFO_2                                            = 1000337000
 *         COPY_IMAGE_INFO_2                                             = 1000337001
 *         COPY_BUFFER_TO_IMAGE_INFO_2                                   = 1000337002
 *         COPY_IMAGE_TO_BUFFER_INFO_2                                   = 1000337003
 *         BLIT_IMAGE_INFO_2                                             = 1000337004
 *         RESOLVE_IMAGE_INFO_2                                          = 1000337005
 *         BUFFER_COPY_2                                                 = 1000337006
 *         IMAGE_COPY_2                                                  = 1000337007
 *         IMAGE_BLIT_2                                                  = 1000337008
 *         BUFFER_IMAGE_COPY_2                                           = 1000337009
 *         IMAGE_RESOLVE_2                                               = 1000337010
 *         PHYSICAL_DEVICE_4444_FORMATS_FEATURES                         = 1000340000
 *         DIRECTFB_SURFACE_CREATE_INFO                                  = 1000346000
 *         PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES              = 1000351000
 *         MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO                           = 1000351002
 *         IMPORT_MEMORY_ZIRCON_HANDLE_INFO                              = 1000364000
 *         MEMORY_ZIRCON_HANDLE_PROPERTIES                               = 1000364001
 *         MEMORY_GET_ZIRCON_HANDLE_INFO                                 = 1000364002
 *         IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO                           = 1000365000
 *         SEMAPHORE_GET_ZIRCON_HANDLE_INFO                              = 1000365001
 *         SCREEN_SURFACE_CREATE_INFO_                                   = 1000378000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class StructureType(val id: Int) {
	
	
	val is_APPLICATION_INFO get() = id == 0
	val is_INSTANCE_CREATE_INFO get() = id == 1
	val is_DEVICE_QUEUE_CREATE_INFO get() = id == 2
	val is_DEVICE_CREATE_INFO get() = id == 3
	val is_SUBMIT_INFO get() = id == 4
	val is_MEMORY_ALLOCATE_INFO get() = id == 5
	val is_MAPPED_MEMORY_RANGE get() = id == 6
	val is_BIND_SPARSE_INFO get() = id == 7
	val is_FENCE_CREATE_INFO get() = id == 8
	val is_SEMAPHORE_CREATE_INFO get() = id == 9
	val is_EVENT_CREATE_INFO get() = id == 10
	val is_QUERY_POOL_CREATE_INFO get() = id == 11
	val is_BUFFER_CREATE_INFO get() = id == 12
	val is_BUFFER_VIEW_CREATE_INFO get() = id == 13
	val is_IMAGE_CREATE_INFO get() = id == 14
	val is_IMAGE_VIEW_CREATE_INFO get() = id == 15
	val is_SHADER_MODULE_CREATE_INFO get() = id == 16
	val is_PIPELINE_CACHE_CREATE_INFO get() = id == 17
	val is_PIPELINE_SHADER_STAGE_CREATE_INFO get() = id == 18
	val is_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO get() = id == 19
	val is_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO get() = id == 20
	val is_PIPELINE_TESSELLATION_STATE_CREATE_INFO get() = id == 21
	val is_PIPELINE_VIEWPORT_STATE_CREATE_INFO get() = id == 22
	val is_PIPELINE_RASTERIZATION_STATE_CREATE_INFO get() = id == 23
	val is_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO get() = id == 24
	val is_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO get() = id == 25
	val is_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO get() = id == 26
	val is_PIPELINE_DYNAMIC_STATE_CREATE_INFO get() = id == 27
	val is_GRAPHICS_PIPELINE_CREATE_INFO get() = id == 28
	val is_COMPUTE_PIPELINE_CREATE_INFO get() = id == 29
	val is_PIPELINE_LAYOUT_CREATE_INFO get() = id == 30
	val is_SAMPLER_CREATE_INFO get() = id == 31
	val is_DESCRIPTOR_SET_LAYOUT_CREATE_INFO get() = id == 32
	val is_DESCRIPTOR_POOL_CREATE_INFO get() = id == 33
	val is_DESCRIPTOR_SET_ALLOCATE_INFO get() = id == 34
	val is_WRITE_DESCRIPTOR_SET get() = id == 35
	val is_COPY_DESCRIPTOR_SET get() = id == 36
	val is_FRAMEBUFFER_CREATE_INFO get() = id == 37
	val is_RENDER_PASS_CREATE_INFO get() = id == 38
	val is_COMMAND_POOL_CREATE_INFO get() = id == 39
	val is_COMMAND_BUFFER_ALLOCATE_INFO get() = id == 40
	val is_COMMAND_BUFFER_INHERITANCE_INFO get() = id == 41
	val is_COMMAND_BUFFER_BEGIN_INFO get() = id == 42
	val is_RENDER_PASS_BEGIN_INFO get() = id == 43
	val is_BUFFER_MEMORY_BARRIER get() = id == 44
	val is_IMAGE_MEMORY_BARRIER get() = id == 45
	val is_MEMORY_BARRIER get() = id == 46
	val is_LOADER_INSTANCE_CREATE_INFO get() = id == 47
	val is_LOADER_DEVICE_CREATE_INFO get() = id == 48
	val is_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES get() = id == 1000094000
	val is_BIND_BUFFER_MEMORY_INFO get() = id == 1000157000
	val is_BIND_IMAGE_MEMORY_INFO get() = id == 1000157001
	val is_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES get() = id == 1000083000
	val is_MEMORY_DEDICATED_REQUIREMENTS get() = id == 1000127000
	val is_MEMORY_DEDICATED_ALLOCATE_INFO get() = id == 1000127001
	val is_MEMORY_ALLOCATE_FLAGS_INFO get() = id == 1000060000
	val is_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO get() = id == 1000060003
	val is_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO get() = id == 1000060004
	val is_DEVICE_GROUP_SUBMIT_INFO get() = id == 1000060005
	val is_DEVICE_GROUP_BIND_SPARSE_INFO get() = id == 1000060006
	val is_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO get() = id == 1000060013
	val is_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO get() = id == 1000060014
	val is_PHYSICAL_DEVICE_GROUP_PROPERTIES get() = id == 1000070000
	val is_DEVICE_GROUP_DEVICE_CREATE_INFO get() = id == 1000070001
	val is_BUFFER_MEMORY_REQUIREMENTS_INFO_2 get() = id == 1000146000
	val is_IMAGE_MEMORY_REQUIREMENTS_INFO_2 get() = id == 1000146001
	val is_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 get() = id == 1000146002
	val is_MEMORY_REQUIREMENTS_2 get() = id == 1000146003
	val is_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 get() = id == 1000146004
	val is_PHYSICAL_DEVICE_FEATURES_2 get() = id == 1000059000
	val is_PHYSICAL_DEVICE_PROPERTIES_2 get() = id == 1000059001
	val is_FORMAT_PROPERTIES_2 get() = id == 1000059002
	val is_IMAGE_FORMAT_PROPERTIES_2 get() = id == 1000059003
	val is_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 get() = id == 1000059004
	val is_QUEUE_FAMILY_PROPERTIES_2 get() = id == 1000059005
	val is_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 get() = id == 1000059006
	val is_SPARSE_IMAGE_FORMAT_PROPERTIES_2 get() = id == 1000059007
	val is_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 get() = id == 1000059008
	val is_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES get() = id == 1000117000
	val is_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO get() = id == 1000117001
	val is_IMAGE_VIEW_USAGE_CREATE_INFO get() = id == 1000117002
	val is_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO get() = id == 1000117003
	val is_RENDER_PASS_MULTIVIEW_CREATE_INFO get() = id == 1000053000
	val is_PHYSICAL_DEVICE_MULTIVIEW_FEATURES get() = id == 1000053001
	val is_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES get() = id == 1000053002
	val is_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES get() = id == 1000120000
	val is_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES get() = id == 1000120000
	val is_PROTECTED_SUBMIT_INFO get() = id == 1000145000
	val is_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES get() = id == 1000145001
	val is_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES get() = id == 1000145002
	val is_DEVICE_QUEUE_INFO_2 get() = id == 1000145003
	val is_SAMPLER_YCBCR_CONVERSION_CREATE_INFO get() = id == 1000156000
	val is_SAMPLER_YCBCR_CONVERSION_INFO get() = id == 1000156001
	val is_BIND_IMAGE_PLANE_MEMORY_INFO get() = id == 1000156002
	val is_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO get() = id == 1000156003
	val is_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES get() = id == 1000156004
	val is_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES get() = id == 1000156005
	val is_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO get() = id == 1000085000
	val is_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO get() = id == 1000071000
	val is_EXTERNAL_IMAGE_FORMAT_PROPERTIES get() = id == 1000071001
	val is_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO get() = id == 1000071002
	val is_EXTERNAL_BUFFER_PROPERTIES get() = id == 1000071003
	val is_PHYSICAL_DEVICE_ID_PROPERTIES get() = id == 1000071004
	val is_EXTERNAL_MEMORY_BUFFER_CREATE_INFO get() = id == 1000072000
	val is_EXTERNAL_MEMORY_IMAGE_CREATE_INFO get() = id == 1000072001
	val is_EXPORT_MEMORY_ALLOCATE_INFO get() = id == 1000072002
	val is_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO get() = id == 1000112000
	val is_EXTERNAL_FENCE_PROPERTIES get() = id == 1000112001
	val is_EXPORT_FENCE_CREATE_INFO get() = id == 1000113000
	val is_EXPORT_SEMAPHORE_CREATE_INFO get() = id == 1000077000
	val is_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO get() = id == 1000076000
	val is_EXTERNAL_SEMAPHORE_PROPERTIES get() = id == 1000076001
	val is_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES get() = id == 1000168000
	val is_DESCRIPTOR_SET_LAYOUT_SUPPORT get() = id == 1000168001
	val is_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES get() = id == 1000063000
	val is_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES get() = id == 1000063000
	val is_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES get() = id == 49
	val is_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES get() = id == 50
	val is_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES get() = id == 51
	val is_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES get() = id == 52
	val is_IMAGE_FORMAT_LIST_CREATE_INFO get() = id == 1000147000
	val is_ATTACHMENT_DESCRIPTION_2 get() = id == 1000109000
	val is_ATTACHMENT_REFERENCE_2 get() = id == 1000109001
	val is_SUBPASS_DESCRIPTION_2 get() = id == 1000109002
	val is_SUBPASS_DEPENDENCY_2 get() = id == 1000109003
	val is_RENDER_PASS_CREATE_INFO_2 get() = id == 1000109004
	val is_SUBPASS_BEGIN_INFO get() = id == 1000109005
	val is_SUBPASS_END_INFO get() = id == 1000109006
	val is_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES get() = id == 1000177000
	val is_PHYSICAL_DEVICE_DRIVER_PROPERTIES get() = id == 1000196000
	val is_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES get() = id == 1000180000
	val is_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES get() = id == 1000082000
	val is_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES get() = id == 1000197000
	val is_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO get() = id == 1000161000
	val is_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES get() = id == 1000161001
	val is_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES get() = id == 1000161002
	val is_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO get() = id == 1000161003
	val is_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT get() = id == 1000161004
	val is_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES get() = id == 1000199000
	val is_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE get() = id == 1000199001
	val is_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES get() = id == 1000221000
	val is_IMAGE_STENCIL_USAGE_CREATE_INFO get() = id == 1000246000
	val is_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES get() = id == 1000130000
	val is_SAMPLER_REDUCTION_MODE_CREATE_INFO get() = id == 1000130001
	val is_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES get() = id == 1000211000
	val is_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES get() = id == 1000108000
	val is_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO get() = id == 1000108001
	val is_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO get() = id == 1000108002
	val is_RENDER_PASS_ATTACHMENT_BEGIN_INFO get() = id == 1000108003
	val is_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES get() = id == 1000253000
	val is_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES get() = id == 1000175000
	val is_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES get() = id == 1000241000
	val is_ATTACHMENT_REFERENCE_STENCIL_LAYOUT get() = id == 1000241001
	val is_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT get() = id == 1000241002
	val is_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES get() = id == 1000261000
	val is_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES get() = id == 1000207000
	val is_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES get() = id == 1000207001
	val is_SEMAPHORE_TYPE_CREATE_INFO get() = id == 1000207002
	val is_TIMELINE_SEMAPHORE_SUBMIT_INFO get() = id == 1000207003
	val is_SEMAPHORE_WAIT_INFO get() = id == 1000207004
	val is_SEMAPHORE_SIGNAL_INFO get() = id == 1000207005
	val is_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES get() = id == 1000257000
	val is_BUFFER_DEVICE_ADDRESS_INFO get() = id == 1000244001
	val is_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO get() = id == 1000257002
	val is_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO get() = id == 1000257003
	val is_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO get() = id == 1000257004
	val is_SWAPCHAIN_CREATE_INFO get() = id == 1000001000
	val is_PRESENT_INFO get() = id == 1000001001
	val is_DEVICE_GROUP_PRESENT_CAPABILITIES get() = id == 1000060007
	val is_IMAGE_SWAPCHAIN_CREATE_INFO get() = id == 1000060008
	val is_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO get() = id == 1000060009
	val is_ACQUIRE_NEXT_IMAGE_INFO get() = id == 1000060010
	val is_DEVICE_GROUP_PRESENT_INFO get() = id == 1000060011
	val is_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO get() = id == 1000060012
	val is_DISPLAY_MODE_CREATE_INFO get() = id == 1000002000
	val is_DISPLAY_SURFACE_CREATE_INFO get() = id == 1000002001
	val is_DISPLAY_PRESENT_INFO get() = id == 1000003000
	val is_XLIB_SURFACE_CREATE_INFO get() = id == 1000004000
	val is_XCB_SURFACE_CREATE_INFO get() = id == 1000005000
	val is_WAYLAND_SURFACE_CREATE_INFO get() = id == 1000006000
	val is_ANDROID_SURFACE_CREATE_INFO get() = id == 1000008000
	val is_WIN32_SURFACE_CREATE_INFO get() = id == 1000009000
	val is_DEBUG_REPORT_CALLBACK_CREATE_INFO get() = id == 1000011000
	val is_DEBUG_REPORT_CREATE_INFO get() = id == 1000011000
	val is_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER get() = id == 1000018000
	val is_DEBUG_MARKER_OBJECT_NAME_INFO get() = id == 1000022000
	val is_DEBUG_MARKER_OBJECT_TAG_INFO get() = id == 1000022001
	val is_DEBUG_MARKER_MARKER_INFO get() = id == 1000022002
	val is_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO get() = id == 1000026000
	val is_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO get() = id == 1000026001
	val is_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO get() = id == 1000026002
	val is_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES get() = id == 1000028000
	val is_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES get() = id == 1000028001
	val is_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO get() = id == 1000028002
	val is_IMAGE_VIEW_HANDLE_INFO get() = id == 1000030000
	val is_IMAGE_VIEW_ADDRESS_PROPERTIES get() = id == 1000030001
	val is_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES get() = id == 1000041000
	val is_STREAM_DESCRIPTOR_SURFACE_CREATE_INFO get() = id == 1000049000
	val is_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES get() = id == 1000050000
	val is_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR get() = id == 1000053000
	val is_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR get() = id == 1000053001
	val is_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR get() = id == 1000053002
	val is_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV get() = id == 1000056000
	val is_EXPORT_MEMORY_ALLOCATE_INFO_NV get() = id == 1000056001
	val is_IMPORT_MEMORY_WIN32_HANDLE_INFO get() = id == 1000057000
	val is_EXPORT_MEMORY_WIN32_HANDLE_INFO get() = id == 1000057001
	val is_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO get() = id == 1000058000
	val is_PHYSICAL_DEVICE_FEATURES_2_KHR get() = id == 1000059000
	val is_PHYSICAL_DEVICE_PROPERTIES_2_KHR get() = id == 1000059001
	val is_FORMAT_PROPERTIES_2_KHR get() = id == 1000059002
	val is_IMAGE_FORMAT_PROPERTIES_2_KHR get() = id == 1000059003
	val is_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR get() = id == 1000059004
	val is_QUEUE_FAMILY_PROPERTIES_2_KHR get() = id == 1000059005
	val is_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR get() = id == 1000059006
	val is_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR get() = id == 1000059007
	val is_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR get() = id == 1000059008
	val is_MEMORY_ALLOCATE_FLAGS_INFO_KHR get() = id == 1000060000
	val is_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR get() = id == 1000060003
	val is_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR get() = id == 1000060004
	val is_DEVICE_GROUP_SUBMIT_INFO_KHR get() = id == 1000060005
	val is_DEVICE_GROUP_BIND_SPARSE_INFO_KHR get() = id == 1000060006
	val is_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR get() = id == 1000060013
	val is_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR get() = id == 1000060014
	val is_VALIDATION_FLAGS get() = id == 1000061000
	val is_VI_SURFACE_CREATE_INFO get() = id == 1000062000
	val is_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES get() = id == 1000066000
	val is_IMAGE_VIEW_ASTC_DECODE_MODE get() = id == 1000067000
	val is_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES get() = id == 1000067001
	val is_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR get() = id == 1000070000
	val is_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR get() = id == 1000070001
	val is_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR get() = id == 1000071000
	val is_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR get() = id == 1000071001
	val is_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR get() = id == 1000071002
	val is_EXTERNAL_BUFFER_PROPERTIES_KHR get() = id == 1000071003
	val is_PHYSICAL_DEVICE_ID_PROPERTIES_KHR get() = id == 1000071004
	val is_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR get() = id == 1000072000
	val is_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR get() = id == 1000072001
	val is_EXPORT_MEMORY_ALLOCATE_INFO_KHR get() = id == 1000072002
	val is_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR get() = id == 1000073000
	val is_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR get() = id == 1000073001
	val is_MEMORY_WIN32_HANDLE_PROPERTIES get() = id == 1000073002
	val is_MEMORY_GET_WIN32_HANDLE_INFO get() = id == 1000073003
	val is_IMPORT_MEMORY_FD_INFO get() = id == 1000074000
	val is_MEMORY_FD_PROPERTIES get() = id == 1000074001
	val is_MEMORY_GET_FD_INFO get() = id == 1000074002
	val is_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR get() = id == 1000075000
	val is_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR get() = id == 1000076000
	val is_EXTERNAL_SEMAPHORE_PROPERTIES_KHR get() = id == 1000076001
	val is_EXPORT_SEMAPHORE_CREATE_INFO_KHR get() = id == 1000077000
	val is_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO get() = id == 1000078000
	val is_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO get() = id == 1000078001
	val is_D3D12_FENCE_SUBMIT_INFO get() = id == 1000078002
	val is_SEMAPHORE_GET_WIN32_HANDLE_INFO get() = id == 1000078003
	val is_IMPORT_SEMAPHORE_FD_INFO get() = id == 1000079000
	val is_SEMAPHORE_GET_FD_INFO get() = id == 1000079001
	val is_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES get() = id == 1000080000
	val is_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO get() = id == 1000081000
	val is_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES get() = id == 1000081001
	val is_CONDITIONAL_RENDERING_BEGIN_INFO get() = id == 1000081002
	val is_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR get() = id == 1000082000
	val is_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES get() = id == 1000082000
	val is_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR get() = id == 1000083000
	val is_PRESENT_REGIONS get() = id == 1000084000
	val is_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR get() = id == 1000085000
	val is_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO get() = id == 1000087000
	val is_SURFACE_CAPABILITIES_2 get() = id == 1000090000
	val is_SURFACE_CAPABILITIES2 get() = id == 1000090000
	val is_DISPLAY_POWER_INFO get() = id == 1000091000
	val is_DEVICE_EVENT_INFO get() = id == 1000091001
	val is_DISPLAY_EVENT_INFO get() = id == 1000091002
	val is_SWAPCHAIN_COUNTER_CREATE_INFO get() = id == 1000091003
	val is_PRESENT_TIMES_INFO get() = id == 1000092000
	val is_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES get() = id == 1000097000
	val is_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO get() = id == 1000098000
	val is_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES get() = id == 1000099000
	val is_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO get() = id == 1000099001
	val is_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES get() = id == 1000101000
	val is_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO get() = id == 1000101001
	val is_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES get() = id == 1000102000
	val is_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO get() = id == 1000102001
	val is_HDR_METADATA get() = id == 1000105000
	val is_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR get() = id == 1000108000
	val is_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR get() = id == 1000108001
	val is_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR get() = id == 1000108002
	val is_RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR get() = id == 1000108003
	val is_ATTACHMENT_DESCRIPTION_2_KHR get() = id == 1000109000
	val is_ATTACHMENT_REFERENCE_2_KHR get() = id == 1000109001
	val is_SUBPASS_DESCRIPTION_2_KHR get() = id == 1000109002
	val is_SUBPASS_DEPENDENCY_2_KHR get() = id == 1000109003
	val is_RENDER_PASS_CREATE_INFO_2_KHR get() = id == 1000109004
	val is_SUBPASS_BEGIN_INFO_KHR get() = id == 1000109005
	val is_SUBPASS_END_INFO_KHR get() = id == 1000109006
	val is_SHARED_PRESENT_SURFACE_CAPABILITIES get() = id == 1000111000
	val is_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR get() = id == 1000112000
	val is_EXTERNAL_FENCE_PROPERTIES_KHR get() = id == 1000112001
	val is_EXPORT_FENCE_CREATE_INFO_KHR get() = id == 1000113000
	val is_IMPORT_FENCE_WIN32_HANDLE_INFO get() = id == 1000114000
	val is_EXPORT_FENCE_WIN32_HANDLE_INFO get() = id == 1000114001
	val is_FENCE_GET_WIN32_HANDLE_INFO get() = id == 1000114002
	val is_IMPORT_FENCE_FD_INFO get() = id == 1000115000
	val is_FENCE_GET_FD_INFO get() = id == 1000115001
	val is_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES get() = id == 1000116000
	val is_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES get() = id == 1000116001
	val is_QUERY_POOL_PERFORMANCE_CREATE_INFO get() = id == 1000116002
	val is_PERFORMANCE_QUERY_SUBMIT_INFO get() = id == 1000116003
	val is_ACQUIRE_PROFILING_LOCK_INFO get() = id == 1000116004
	val is_PERFORMANCE_COUNTER get() = id == 1000116005
	val is_PERFORMANCE_COUNTER_DESCRIPTION get() = id == 1000116006
	val is_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR get() = id == 1000117000
	val is_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR get() = id == 1000117001
	val is_IMAGE_VIEW_USAGE_CREATE_INFO_KHR get() = id == 1000117002
	val is_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR get() = id == 1000117003
	val is_PHYSICAL_DEVICE_SURFACE_INFO_2 get() = id == 1000119000
	val is_SURFACE_CAPABILITIES_2_KHR get() = id == 1000119001
	val is_SURFACE_FORMAT_2 get() = id == 1000119002
	val is_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR get() = id == 1000120000
	val is_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR get() = id == 1000120000
	val is_DISPLAY_PROPERTIES_2 get() = id == 1000121000
	val is_DISPLAY_PLANE_PROPERTIES_2 get() = id == 1000121001
	val is_DISPLAY_MODE_PROPERTIES_2 get() = id == 1000121002
	val is_DISPLAY_PLANE_INFO_2 get() = id == 1000121003
	val is_DISPLAY_PLANE_CAPABILITIES_2 get() = id == 1000121004
	val is_IOS_SURFACE_CREATE_INFO get() = id == 1000122000
	val is_MACOS_SURFACE_CREATE_INFO get() = id == 1000123000
	val is_MEMORY_DEDICATED_REQUIREMENTS_KHR get() = id == 1000127000
	val is_MEMORY_DEDICATED_ALLOCATE_INFO_KHR get() = id == 1000127001
	val is_DEBUG_UTILS_OBJECT_NAME_INFO get() = id == 1000128000
	val is_DEBUG_UTILS_OBJECT_TAG_INFO get() = id == 1000128001
	val is_DEBUG_UTILS_LABEL get() = id == 1000128002
	val is_DEBUG_UTILS_MESSENGER_CALLBACK_DATA get() = id == 1000128003
	val is_DEBUG_UTILS_MESSENGER_CREATE_INFO get() = id == 1000128004
	val is_ANDROID_HARDWARE_BUFFER_USAGE get() = id == 1000129000
	val is_ANDROID_HARDWARE_BUFFER_PROPERTIES get() = id == 1000129001
	val is_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES get() = id == 1000129002
	val is_IMPORT_ANDROID_HARDWARE_BUFFER_INFO get() = id == 1000129003
	val is_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO get() = id == 1000129004
	val is_EXTERNAL_FORMAT get() = id == 1000129005
	val is_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT get() = id == 1000130000
	val is_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT get() = id == 1000130001
	val is_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES get() = id == 1000138000
	val is_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES get() = id == 1000138001
	val is_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK get() = id == 1000138002
	val is_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO get() = id == 1000138003
	val is_SAMPLE_LOCATIONS_INFO get() = id == 1000143000
	val is_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO get() = id == 1000143001
	val is_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO get() = id == 1000143002
	val is_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES get() = id == 1000143003
	val is_MULTISAMPLE_PROPERTIES get() = id == 1000143004
	val is_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR get() = id == 1000146000
	val is_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR get() = id == 1000146001
	val is_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR get() = id == 1000146002
	val is_MEMORY_REQUIREMENTS_2_KHR get() = id == 1000146003
	val is_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR get() = id == 1000146004
	val is_IMAGE_FORMAT_LIST_CREATE_INFO_KHR get() = id == 1000147000
	val is_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES get() = id == 1000148000
	val is_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES get() = id == 1000148001
	val is_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO get() = id == 1000148002
	val is_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO get() = id == 1000149000
	val is_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE get() = id == 1000150007
	val is_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO get() = id == 1000150000
	val is_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO get() = id == 1000150002
	val is_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA get() = id == 1000150003
	val is_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA get() = id == 1000150004
	val is_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA get() = id == 1000150005
	val is_ACCELERATION_STRUCTURE_GEOMETRY get() = id == 1000150006
	val is_ACCELERATION_STRUCTURE_VERSION_INFO get() = id == 1000150009
	val is_COPY_ACCELERATION_STRUCTURE_INFO get() = id == 1000150010
	val is_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO get() = id == 1000150011
	val is_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO get() = id == 1000150012
	val is_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES get() = id == 1000150013
	val is_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES get() = id == 1000150014
	val is_ACCELERATION_STRUCTURE_CREATE_INFO get() = id == 1000150017
	val is_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO get() = id == 1000150020
	val is_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES get() = id == 1000347000
	val is_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES get() = id == 1000347001
	val is_RAY_TRACING_PIPELINE_CREATE_INFO get() = id == 1000150015
	val is_RAY_TRACING_SHADER_GROUP_CREATE_INFO get() = id == 1000150016
	val is_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO get() = id == 1000150018
	val is_PHYSICAL_DEVICE_RAY_QUERY_FEATURES get() = id == 1000348013
	val is_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO get() = id == 1000152000
	val is_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES get() = id == 1000154000
	val is_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES get() = id == 1000154001
	val is_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR get() = id == 1000156000
	val is_SAMPLER_YCBCR_CONVERSION_INFO_KHR get() = id == 1000156001
	val is_BIND_IMAGE_PLANE_MEMORY_INFO_KHR get() = id == 1000156002
	val is_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR get() = id == 1000156003
	val is_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR get() = id == 1000156004
	val is_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR get() = id == 1000156005
	val is_BIND_BUFFER_MEMORY_INFO_KHR get() = id == 1000157000
	val is_BIND_IMAGE_MEMORY_INFO_KHR get() = id == 1000157001
	val is_DRM_FORMAT_MODIFIER_PROPERTIES_LIST get() = id == 1000158000
	val is_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO get() = id == 1000158002
	val is_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO get() = id == 1000158003
	val is_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO get() = id == 1000158004
	val is_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES get() = id == 1000158005
	val is_VALIDATION_CACHE_CREATE_INFO get() = id == 1000160000
	val is_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO get() = id == 1000160001
	val is_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT get() = id == 1000161000
	val is_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT get() = id == 1000161001
	val is_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT get() = id == 1000161002
	val is_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT get() = id == 1000161003
	val is_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT get() = id == 1000161004
	val is_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES get() = id == 1000163000
	val is_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES get() = id == 1000163001
	val is_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO get() = id == 1000164000
	val is_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES get() = id == 1000164001
	val is_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES get() = id == 1000164002
	val is_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO get() = id == 1000164005
	val is_RAY_TRACING_PIPELINE_CREATE_INFO_NV get() = id == 1000165000
	val is_ACCELERATION_STRUCTURE_CREATE_INFO_NV get() = id == 1000165001
	val is_GEOMETRY get() = id == 1000165003
	val is_GEOMETRY_TRIANGLES get() = id == 1000165004
	val is_GEOMETRY_AABB get() = id == 1000165005
	val is_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO get() = id == 1000165006
	val is_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV get() = id == 1000165007
	val is_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO get() = id == 1000165008
	val is_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES get() = id == 1000165009
	val is_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV get() = id == 1000165011
	val is_ACCELERATION_STRUCTURE_INFO get() = id == 1000165012
	val is_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES get() = id == 1000166000
	val is_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO get() = id == 1000166001
	val is_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR get() = id == 1000168000
	val is_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR get() = id == 1000168001
	val is_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO get() = id == 1000170000
	val is_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES get() = id == 1000170001
	val is_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO get() = id == 1000174000
	val is_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR get() = id == 1000175000
	val is_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR get() = id == 1000177000
	val is_IMPORT_MEMORY_HOST_POINTER_INFO get() = id == 1000178000
	val is_MEMORY_HOST_POINTER_PROPERTIES get() = id == 1000178001
	val is_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES get() = id == 1000178002
	val is_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR get() = id == 1000180000
	val is_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES get() = id == 1000181000
	val is_PIPELINE_COMPILER_CONTROL_CREATE_INFO get() = id == 1000183000
	val is_CALIBRATED_TIMESTAMP_INFO get() = id == 1000184000
	val is_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES get() = id == 1000185000
	val is_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO get() = id == 1000189000
	val is_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES get() = id == 1000190000
	val is_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO get() = id == 1000190001
	val is_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES get() = id == 1000190002
	val is_PRESENT_FRAME_TOKEN get() = id == 1000191000
	val is_PIPELINE_CREATION_FEEDBACK_CREATE_INFO get() = id == 1000192000
	val is_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR get() = id == 1000196000
	val is_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR get() = id == 1000197000
	val is_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR get() = id == 1000199000
	val is_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR get() = id == 1000199001
	val is_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES get() = id == 1000201000
	val is_PHYSICAL_DEVICE_MESH_SHADER_FEATURES get() = id == 1000202000
	val is_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES get() = id == 1000202001
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES get() = id == 1000203000
	val is_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES get() = id == 1000204000
	val is_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO get() = id == 1000205000
	val is_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES get() = id == 1000205002
	val is_CHECKPOINT_DATA get() = id == 1000206000
	val is_QUEUE_FAMILY_CHECKPOINT_PROPERTIES get() = id == 1000206001
	val is_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR get() = id == 1000207000
	val is_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR get() = id == 1000207001
	val is_SEMAPHORE_TYPE_CREATE_INFO_KHR get() = id == 1000207002
	val is_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR get() = id == 1000207003
	val is_SEMAPHORE_WAIT_INFO_KHR get() = id == 1000207004
	val is_SEMAPHORE_SIGNAL_INFO_KHR get() = id == 1000207005
	val is_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES get() = id == 1000209000
	val is_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO get() = id == 1000210000
	val is_QUERY_POOL_CREATE_INFO_INTEL get() = id == 1000210000
	val is_INITIALIZE_PERFORMANCE_API_INFO get() = id == 1000210001
	val is_PERFORMANCE_MARKER_INFO get() = id == 1000210002
	val is_PERFORMANCE_STREAM_MARKER_INFO get() = id == 1000210003
	val is_PERFORMANCE_OVERRIDE_INFO get() = id == 1000210004
	val is_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO get() = id == 1000210005
	val is_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR get() = id == 1000211000
	val is_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES get() = id == 1000212000
	val is_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES get() = id == 1000213000
	val is_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO get() = id == 1000213001
	val is_IMAGEPIPE_SURFACE_CREATE_INFO get() = id == 1000214000
	val is_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES get() = id == 1000215000
	val is_METAL_SURFACE_CREATE_INFO get() = id == 1000217000
	val is_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES get() = id == 1000218000
	val is_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES get() = id == 1000218001
	val is_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO get() = id == 1000218002
	val is_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT get() = id == 1000221000
	val is_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES get() = id == 1000225000
	val is_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO get() = id == 1000225001
	val is_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES get() = id == 1000225002
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO get() = id == 1000226000
	val is_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO get() = id == 1000226001
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES get() = id == 1000226002
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES get() = id == 1000226003
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE get() = id == 1000226004
	val is_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2 get() = id == 1000227000
	val is_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES get() = id == 1000229000
	val is_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES get() = id == 1000234000
	val is_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES get() = id == 1000237000
	val is_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES get() = id == 1000238000
	val is_MEMORY_PRIORITY_ALLOCATE_INFO get() = id == 1000238001
	val is_SURFACE_PROTECTED_CAPABILITIES get() = id == 1000239000
	val is_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES get() = id == 1000240000
	val is_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR get() = id == 1000241000
	val is_ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR get() = id == 1000241001
	val is_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR get() = id == 1000241002
	val is_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT get() = id == 1000244000
	val is_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES get() = id == 1000244000
	val is_BUFFER_DEVICE_ADDRESS_INFO_EXT get() = id == 1000244001
	val is_BUFFER_DEVICE_ADDRESS_CREATE_INFO get() = id == 1000244002
	val is_PHYSICAL_DEVICE_TOOL_PROPERTIES get() = id == 1000245000
	val is_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT get() = id == 1000246000
	val is_VALIDATION_FEATURES get() = id == 1000247000
	val is_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES get() = id == 1000249000
	val is_COOPERATIVE_MATRIX_PROPERTIES get() = id == 1000249001
	val is_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES get() = id == 1000249002
	val is_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES get() = id == 1000250000
	val is_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO get() = id == 1000250001
	val is_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION get() = id == 1000250002
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES get() = id == 1000251000
	val is_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES get() = id == 1000252000
	val is_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR get() = id == 1000253000
	val is_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO get() = id == 1000255000
	val is_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE get() = id == 1000255002
	val is_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO get() = id == 1000255001
	val is_HEADLESS_SURFACE_CREATE_INFO get() = id == 1000256000
	val is_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR get() = id == 1000257000
	val is_BUFFER_DEVICE_ADDRESS_INFO_KHR get() = id == 1000244001
	val is_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR get() = id == 1000257002
	val is_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR get() = id == 1000257003
	val is_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR get() = id == 1000257004
	val is_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES get() = id == 1000259000
	val is_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO get() = id == 1000259001
	val is_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES get() = id == 1000259002
	val is_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES get() = id == 1000260000
	val is_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT get() = id == 1000261000
	val is_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES get() = id == 1000265000
	val is_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES get() = id == 1000267000
	val is_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES get() = id == 1000269000
	val is_PIPELINE_INFO get() = id == 1000269001
	val is_PIPELINE_EXECUTABLE_PROPERTIES get() = id == 1000269002
	val is_PIPELINE_EXECUTABLE_INFO get() = id == 1000269003
	val is_PIPELINE_EXECUTABLE_STATISTIC get() = id == 1000269004
	val is_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION get() = id == 1000269005
	val is_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES get() = id == 1000276000
	val is_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES get() = id == 1000277000
	val is_GRAPHICS_SHADER_GROUP_CREATE_INFO get() = id == 1000277001
	val is_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO get() = id == 1000277002
	val is_INDIRECT_COMMANDS_LAYOUT_TOKEN get() = id == 1000277003
	val is_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO get() = id == 1000277004
	val is_GENERATED_COMMANDS_INFO get() = id == 1000277005
	val is_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO get() = id == 1000277006
	val is_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES get() = id == 1000277007
	val is_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES get() = id == 1000281000
	val is_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES get() = id == 1000281001
	val is_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO get() = id == 1000282000
	val is_RENDER_PASS_TRANSFORM_BEGIN_INFO get() = id == 1000282001
	val is_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES get() = id == 1000284000
	val is_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO get() = id == 1000284001
	val is_DEVICE_MEMORY_REPORT_CALLBACK_DATA get() = id == 1000284002
	val is_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES get() = id == 1000286000
	val is_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES get() = id == 1000286001
	val is_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO get() = id == 1000287000
	val is_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES get() = id == 1000287001
	val is_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES get() = id == 1000287002
	val is_PIPELINE_LIBRARY_CREATE_INFO get() = id == 1000290000
	val is_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES get() = id == 1000295000
	val is_DEVICE_PRIVATE_DATA_CREATE_INFO get() = id == 1000295001
	val is_PRIVATE_DATA_SLOT_CREATE_INFO get() = id == 1000295002
	val is_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES get() = id == 1000297000
	val is_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES get() = id == 1000300000
	val is_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO get() = id == 1000300001
	val is_MEMORY_BARRIER_2 get() = id == 1000314000
	val is_BUFFER_MEMORY_BARRIER_2 get() = id == 1000314001
	val is_IMAGE_MEMORY_BARRIER_2 get() = id == 1000314002
	val is_DEPENDENCY_INFO get() = id == 1000314003
	val is_SUBMIT_INFO_2 get() = id == 1000314004
	val is_SEMAPHORE_SUBMIT_INFO get() = id == 1000314005
	val is_COMMAND_BUFFER_SUBMIT_INFO get() = id == 1000314006
	val is_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES get() = id == 1000314007
	val is_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2 get() = id == 1000314008
	val is_CHECKPOINT_DATA_2 get() = id == 1000314009
	val is_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES get() = id == 1000325000
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES get() = id == 1000326000
	val is_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES get() = id == 1000326001
	val is_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO get() = id == 1000326002
	val is_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES get() = id == 1000332000
	val is_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES get() = id == 1000332001
	val is_COPY_COMMAND_TRANSFORM_INFO get() = id == 1000333000
	val is_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES get() = id == 1000335000
	val is_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES get() = id == 1000336000
	val is_COPY_BUFFER_INFO_2 get() = id == 1000337000
	val is_COPY_IMAGE_INFO_2 get() = id == 1000337001
	val is_COPY_BUFFER_TO_IMAGE_INFO_2 get() = id == 1000337002
	val is_COPY_IMAGE_TO_BUFFER_INFO_2 get() = id == 1000337003
	val is_BLIT_IMAGE_INFO_2 get() = id == 1000337004
	val is_RESOLVE_IMAGE_INFO_2 get() = id == 1000337005
	val is_BUFFER_COPY_2 get() = id == 1000337006
	val is_IMAGE_COPY_2 get() = id == 1000337007
	val is_IMAGE_BLIT_2 get() = id == 1000337008
	val is_BUFFER_IMAGE_COPY_2 get() = id == 1000337009
	val is_IMAGE_RESOLVE_2 get() = id == 1000337010
	val is_PHYSICAL_DEVICE_4444_FORMATS_FEATURES get() = id == 1000340000
	val is_DIRECTFB_SURFACE_CREATE_INFO get() = id == 1000346000
	val is_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES get() = id == 1000351000
	val is_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO get() = id == 1000351002
	val is_IMPORT_MEMORY_ZIRCON_HANDLE_INFO get() = id == 1000364000
	val is_MEMORY_ZIRCON_HANDLE_PROPERTIES get() = id == 1000364001
	val is_MEMORY_GET_ZIRCON_HANDLE_INFO get() = id == 1000364002
	val is_IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO get() = id == 1000365000
	val is_SEMAPHORE_GET_ZIRCON_HANDLE_INFO get() = id == 1000365001
	val is_SCREEN_SURFACE_CREATE_INFO_ get() = id == 1000378000
	
	
	
	override fun toString() = when(id) {
		APPLICATION_INFO.id -> "APPLICATION_INFO"
		INSTANCE_CREATE_INFO.id -> "INSTANCE_CREATE_INFO"
		DEVICE_QUEUE_CREATE_INFO.id -> "DEVICE_QUEUE_CREATE_INFO"
		DEVICE_CREATE_INFO.id -> "DEVICE_CREATE_INFO"
		SUBMIT_INFO.id -> "SUBMIT_INFO"
		MEMORY_ALLOCATE_INFO.id -> "MEMORY_ALLOCATE_INFO"
		MAPPED_MEMORY_RANGE.id -> "MAPPED_MEMORY_RANGE"
		BIND_SPARSE_INFO.id -> "BIND_SPARSE_INFO"
		FENCE_CREATE_INFO.id -> "FENCE_CREATE_INFO"
		SEMAPHORE_CREATE_INFO.id -> "SEMAPHORE_CREATE_INFO"
		EVENT_CREATE_INFO.id -> "EVENT_CREATE_INFO"
		QUERY_POOL_CREATE_INFO.id -> "QUERY_POOL_CREATE_INFO"
		BUFFER_CREATE_INFO.id -> "BUFFER_CREATE_INFO"
		BUFFER_VIEW_CREATE_INFO.id -> "BUFFER_VIEW_CREATE_INFO"
		IMAGE_CREATE_INFO.id -> "IMAGE_CREATE_INFO"
		IMAGE_VIEW_CREATE_INFO.id -> "IMAGE_VIEW_CREATE_INFO"
		SHADER_MODULE_CREATE_INFO.id -> "SHADER_MODULE_CREATE_INFO"
		PIPELINE_CACHE_CREATE_INFO.id -> "PIPELINE_CACHE_CREATE_INFO"
		PIPELINE_SHADER_STAGE_CREATE_INFO.id -> "PIPELINE_SHADER_STAGE_CREATE_INFO"
		PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO.id -> "PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO"
		PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO.id -> "PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO"
		PIPELINE_TESSELLATION_STATE_CREATE_INFO.id -> "PIPELINE_TESSELLATION_STATE_CREATE_INFO"
		PIPELINE_VIEWPORT_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_STATE_CREATE_INFO"
		PIPELINE_RASTERIZATION_STATE_CREATE_INFO.id -> "PIPELINE_RASTERIZATION_STATE_CREATE_INFO"
		PIPELINE_MULTISAMPLE_STATE_CREATE_INFO.id -> "PIPELINE_MULTISAMPLE_STATE_CREATE_INFO"
		PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO.id -> "PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO"
		PIPELINE_COLOR_BLEND_STATE_CREATE_INFO.id -> "PIPELINE_COLOR_BLEND_STATE_CREATE_INFO"
		PIPELINE_DYNAMIC_STATE_CREATE_INFO.id -> "PIPELINE_DYNAMIC_STATE_CREATE_INFO"
		GRAPHICS_PIPELINE_CREATE_INFO.id -> "GRAPHICS_PIPELINE_CREATE_INFO"
		COMPUTE_PIPELINE_CREATE_INFO.id -> "COMPUTE_PIPELINE_CREATE_INFO"
		PIPELINE_LAYOUT_CREATE_INFO.id -> "PIPELINE_LAYOUT_CREATE_INFO"
		SAMPLER_CREATE_INFO.id -> "SAMPLER_CREATE_INFO"
		DESCRIPTOR_SET_LAYOUT_CREATE_INFO.id -> "DESCRIPTOR_SET_LAYOUT_CREATE_INFO"
		DESCRIPTOR_POOL_CREATE_INFO.id -> "DESCRIPTOR_POOL_CREATE_INFO"
		DESCRIPTOR_SET_ALLOCATE_INFO.id -> "DESCRIPTOR_SET_ALLOCATE_INFO"
		WRITE_DESCRIPTOR_SET.id -> "WRITE_DESCRIPTOR_SET"
		COPY_DESCRIPTOR_SET.id -> "COPY_DESCRIPTOR_SET"
		FRAMEBUFFER_CREATE_INFO.id -> "FRAMEBUFFER_CREATE_INFO"
		RENDER_PASS_CREATE_INFO.id -> "RENDER_PASS_CREATE_INFO"
		COMMAND_POOL_CREATE_INFO.id -> "COMMAND_POOL_CREATE_INFO"
		COMMAND_BUFFER_ALLOCATE_INFO.id -> "COMMAND_BUFFER_ALLOCATE_INFO"
		COMMAND_BUFFER_INHERITANCE_INFO.id -> "COMMAND_BUFFER_INHERITANCE_INFO"
		COMMAND_BUFFER_BEGIN_INFO.id -> "COMMAND_BUFFER_BEGIN_INFO"
		RENDER_PASS_BEGIN_INFO.id -> "RENDER_PASS_BEGIN_INFO"
		BUFFER_MEMORY_BARRIER.id -> "BUFFER_MEMORY_BARRIER"
		IMAGE_MEMORY_BARRIER.id -> "IMAGE_MEMORY_BARRIER"
		MEMORY_BARRIER.id -> "MEMORY_BARRIER"
		LOADER_INSTANCE_CREATE_INFO.id -> "LOADER_INSTANCE_CREATE_INFO"
		LOADER_DEVICE_CREATE_INFO.id -> "LOADER_DEVICE_CREATE_INFO"
		PHYSICAL_DEVICE_SUBGROUP_PROPERTIES.id -> "PHYSICAL_DEVICE_SUBGROUP_PROPERTIES"
		BIND_BUFFER_MEMORY_INFO.id -> "BIND_BUFFER_MEMORY_INFO"
		BIND_IMAGE_MEMORY_INFO.id -> "BIND_IMAGE_MEMORY_INFO"
		PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES.id -> "PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES"
		MEMORY_DEDICATED_REQUIREMENTS.id -> "MEMORY_DEDICATED_REQUIREMENTS"
		MEMORY_DEDICATED_ALLOCATE_INFO.id -> "MEMORY_DEDICATED_ALLOCATE_INFO"
		MEMORY_ALLOCATE_FLAGS_INFO.id -> "MEMORY_ALLOCATE_FLAGS_INFO"
		DEVICE_GROUP_RENDER_PASS_BEGIN_INFO.id -> "DEVICE_GROUP_RENDER_PASS_BEGIN_INFO"
		DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO.id -> "DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO"
		DEVICE_GROUP_SUBMIT_INFO.id -> "DEVICE_GROUP_SUBMIT_INFO"
		DEVICE_GROUP_BIND_SPARSE_INFO.id -> "DEVICE_GROUP_BIND_SPARSE_INFO"
		BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO.id -> "BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO"
		BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO.id -> "BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO"
		PHYSICAL_DEVICE_GROUP_PROPERTIES.id -> "PHYSICAL_DEVICE_GROUP_PROPERTIES"
		DEVICE_GROUP_DEVICE_CREATE_INFO.id -> "DEVICE_GROUP_DEVICE_CREATE_INFO"
		BUFFER_MEMORY_REQUIREMENTS_INFO_2.id -> "BUFFER_MEMORY_REQUIREMENTS_INFO_2"
		IMAGE_MEMORY_REQUIREMENTS_INFO_2.id -> "IMAGE_MEMORY_REQUIREMENTS_INFO_2"
		IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2.id -> "IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2"
		MEMORY_REQUIREMENTS_2.id -> "MEMORY_REQUIREMENTS_2"
		SPARSE_IMAGE_MEMORY_REQUIREMENTS_2.id -> "SPARSE_IMAGE_MEMORY_REQUIREMENTS_2"
		PHYSICAL_DEVICE_FEATURES_2.id -> "PHYSICAL_DEVICE_FEATURES_2"
		PHYSICAL_DEVICE_PROPERTIES_2.id -> "PHYSICAL_DEVICE_PROPERTIES_2"
		FORMAT_PROPERTIES_2.id -> "FORMAT_PROPERTIES_2"
		IMAGE_FORMAT_PROPERTIES_2.id -> "IMAGE_FORMAT_PROPERTIES_2"
		PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2.id -> "PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2"
		QUEUE_FAMILY_PROPERTIES_2.id -> "QUEUE_FAMILY_PROPERTIES_2"
		PHYSICAL_DEVICE_MEMORY_PROPERTIES_2.id -> "PHYSICAL_DEVICE_MEMORY_PROPERTIES_2"
		SPARSE_IMAGE_FORMAT_PROPERTIES_2.id -> "SPARSE_IMAGE_FORMAT_PROPERTIES_2"
		PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2.id -> "PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2"
		PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES.id -> "PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES"
		RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO.id -> "RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO"
		IMAGE_VIEW_USAGE_CREATE_INFO.id -> "IMAGE_VIEW_USAGE_CREATE_INFO"
		PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO.id -> "PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO"
		RENDER_PASS_MULTIVIEW_CREATE_INFO.id -> "RENDER_PASS_MULTIVIEW_CREATE_INFO"
		PHYSICAL_DEVICE_MULTIVIEW_FEATURES.id -> "PHYSICAL_DEVICE_MULTIVIEW_FEATURES"
		PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES.id -> "PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES"
		PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES.id -> "PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES"
		PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES.id -> "PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES"
		PROTECTED_SUBMIT_INFO.id -> "PROTECTED_SUBMIT_INFO"
		PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES.id -> "PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES"
		PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES.id -> "PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES"
		DEVICE_QUEUE_INFO_2.id -> "DEVICE_QUEUE_INFO_2"
		SAMPLER_YCBCR_CONVERSION_CREATE_INFO.id -> "SAMPLER_YCBCR_CONVERSION_CREATE_INFO"
		SAMPLER_YCBCR_CONVERSION_INFO.id -> "SAMPLER_YCBCR_CONVERSION_INFO"
		BIND_IMAGE_PLANE_MEMORY_INFO.id -> "BIND_IMAGE_PLANE_MEMORY_INFO"
		IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO.id -> "IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO"
		PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES.id -> "PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES"
		SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES.id -> "SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES"
		DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO.id -> "DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO"
		PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO.id -> "PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO"
		EXTERNAL_IMAGE_FORMAT_PROPERTIES.id -> "EXTERNAL_IMAGE_FORMAT_PROPERTIES"
		PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO.id -> "PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO"
		EXTERNAL_BUFFER_PROPERTIES.id -> "EXTERNAL_BUFFER_PROPERTIES"
		PHYSICAL_DEVICE_ID_PROPERTIES.id -> "PHYSICAL_DEVICE_ID_PROPERTIES"
		EXTERNAL_MEMORY_BUFFER_CREATE_INFO.id -> "EXTERNAL_MEMORY_BUFFER_CREATE_INFO"
		EXTERNAL_MEMORY_IMAGE_CREATE_INFO.id -> "EXTERNAL_MEMORY_IMAGE_CREATE_INFO"
		EXPORT_MEMORY_ALLOCATE_INFO.id -> "EXPORT_MEMORY_ALLOCATE_INFO"
		PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO.id -> "PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO"
		EXTERNAL_FENCE_PROPERTIES.id -> "EXTERNAL_FENCE_PROPERTIES"
		EXPORT_FENCE_CREATE_INFO.id -> "EXPORT_FENCE_CREATE_INFO"
		EXPORT_SEMAPHORE_CREATE_INFO.id -> "EXPORT_SEMAPHORE_CREATE_INFO"
		PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO.id -> "PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO"
		EXTERNAL_SEMAPHORE_PROPERTIES.id -> "EXTERNAL_SEMAPHORE_PROPERTIES"
		PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES.id -> "PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES"
		DESCRIPTOR_SET_LAYOUT_SUPPORT.id -> "DESCRIPTOR_SET_LAYOUT_SUPPORT"
		PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES"
		PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES"
		PHYSICAL_DEVICE_VULKAN_1_1_FEATURES.id -> "PHYSICAL_DEVICE_VULKAN_1_1_FEATURES"
		PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES.id -> "PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES"
		PHYSICAL_DEVICE_VULKAN_1_2_FEATURES.id -> "PHYSICAL_DEVICE_VULKAN_1_2_FEATURES"
		PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES.id -> "PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES"
		IMAGE_FORMAT_LIST_CREATE_INFO.id -> "IMAGE_FORMAT_LIST_CREATE_INFO"
		ATTACHMENT_DESCRIPTION_2.id -> "ATTACHMENT_DESCRIPTION_2"
		ATTACHMENT_REFERENCE_2.id -> "ATTACHMENT_REFERENCE_2"
		SUBPASS_DESCRIPTION_2.id -> "SUBPASS_DESCRIPTION_2"
		SUBPASS_DEPENDENCY_2.id -> "SUBPASS_DEPENDENCY_2"
		RENDER_PASS_CREATE_INFO_2.id -> "RENDER_PASS_CREATE_INFO_2"
		SUBPASS_BEGIN_INFO.id -> "SUBPASS_BEGIN_INFO"
		SUBPASS_END_INFO.id -> "SUBPASS_END_INFO"
		PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES.id -> "PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES"
		PHYSICAL_DEVICE_DRIVER_PROPERTIES.id -> "PHYSICAL_DEVICE_DRIVER_PROPERTIES"
		PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES"
		PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES"
		PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES.id -> "PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES"
		DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO.id -> "DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO"
		PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES.id -> "PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES"
		PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES.id -> "PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES"
		DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO.id -> "DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO"
		DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT.id -> "DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT"
		PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES.id -> "PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES"
		SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE.id -> "SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE"
		PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES.id -> "PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES"
		IMAGE_STENCIL_USAGE_CREATE_INFO.id -> "IMAGE_STENCIL_USAGE_CREATE_INFO"
		PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES.id -> "PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES"
		SAMPLER_REDUCTION_MODE_CREATE_INFO.id -> "SAMPLER_REDUCTION_MODE_CREATE_INFO"
		PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES.id -> "PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES"
		PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES.id -> "PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES"
		FRAMEBUFFER_ATTACHMENTS_CREATE_INFO.id -> "FRAMEBUFFER_ATTACHMENTS_CREATE_INFO"
		FRAMEBUFFER_ATTACHMENT_IMAGE_INFO.id -> "FRAMEBUFFER_ATTACHMENT_IMAGE_INFO"
		RENDER_PASS_ATTACHMENT_BEGIN_INFO.id -> "RENDER_PASS_ATTACHMENT_BEGIN_INFO"
		PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES.id -> "PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES"
		PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES"
		PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES.id -> "PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES"
		ATTACHMENT_REFERENCE_STENCIL_LAYOUT.id -> "ATTACHMENT_REFERENCE_STENCIL_LAYOUT"
		ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT.id -> "ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT"
		PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES.id -> "PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES"
		PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES.id -> "PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES"
		PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES.id -> "PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES"
		SEMAPHORE_TYPE_CREATE_INFO.id -> "SEMAPHORE_TYPE_CREATE_INFO"
		TIMELINE_SEMAPHORE_SUBMIT_INFO.id -> "TIMELINE_SEMAPHORE_SUBMIT_INFO"
		SEMAPHORE_WAIT_INFO.id -> "SEMAPHORE_WAIT_INFO"
		SEMAPHORE_SIGNAL_INFO.id -> "SEMAPHORE_SIGNAL_INFO"
		PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES.id -> "PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES"
		BUFFER_DEVICE_ADDRESS_INFO.id -> "BUFFER_DEVICE_ADDRESS_INFO"
		BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO.id -> "BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO"
		MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO.id -> "MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO"
		DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO.id -> "DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO"
		SWAPCHAIN_CREATE_INFO.id -> "SWAPCHAIN_CREATE_INFO"
		PRESENT_INFO.id -> "PRESENT_INFO"
		DEVICE_GROUP_PRESENT_CAPABILITIES.id -> "DEVICE_GROUP_PRESENT_CAPABILITIES"
		IMAGE_SWAPCHAIN_CREATE_INFO.id -> "IMAGE_SWAPCHAIN_CREATE_INFO"
		BIND_IMAGE_MEMORY_SWAPCHAIN_INFO.id -> "BIND_IMAGE_MEMORY_SWAPCHAIN_INFO"
		ACQUIRE_NEXT_IMAGE_INFO.id -> "ACQUIRE_NEXT_IMAGE_INFO"
		DEVICE_GROUP_PRESENT_INFO.id -> "DEVICE_GROUP_PRESENT_INFO"
		DEVICE_GROUP_SWAPCHAIN_CREATE_INFO.id -> "DEVICE_GROUP_SWAPCHAIN_CREATE_INFO"
		DISPLAY_MODE_CREATE_INFO.id -> "DISPLAY_MODE_CREATE_INFO"
		DISPLAY_SURFACE_CREATE_INFO.id -> "DISPLAY_SURFACE_CREATE_INFO"
		DISPLAY_PRESENT_INFO.id -> "DISPLAY_PRESENT_INFO"
		XLIB_SURFACE_CREATE_INFO.id -> "XLIB_SURFACE_CREATE_INFO"
		XCB_SURFACE_CREATE_INFO.id -> "XCB_SURFACE_CREATE_INFO"
		WAYLAND_SURFACE_CREATE_INFO.id -> "WAYLAND_SURFACE_CREATE_INFO"
		ANDROID_SURFACE_CREATE_INFO.id -> "ANDROID_SURFACE_CREATE_INFO"
		WIN32_SURFACE_CREATE_INFO.id -> "WIN32_SURFACE_CREATE_INFO"
		DEBUG_REPORT_CALLBACK_CREATE_INFO.id -> "DEBUG_REPORT_CALLBACK_CREATE_INFO"
		DEBUG_REPORT_CREATE_INFO.id -> "DEBUG_REPORT_CREATE_INFO"
		PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER.id -> "PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER"
		DEBUG_MARKER_OBJECT_NAME_INFO.id -> "DEBUG_MARKER_OBJECT_NAME_INFO"
		DEBUG_MARKER_OBJECT_TAG_INFO.id -> "DEBUG_MARKER_OBJECT_TAG_INFO"
		DEBUG_MARKER_MARKER_INFO.id -> "DEBUG_MARKER_MARKER_INFO"
		DEDICATED_ALLOCATION_IMAGE_CREATE_INFO.id -> "DEDICATED_ALLOCATION_IMAGE_CREATE_INFO"
		DEDICATED_ALLOCATION_BUFFER_CREATE_INFO.id -> "DEDICATED_ALLOCATION_BUFFER_CREATE_INFO"
		DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO.id -> "DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO"
		PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES.id -> "PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES"
		PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES.id -> "PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES"
		PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO.id -> "PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO"
		IMAGE_VIEW_HANDLE_INFO.id -> "IMAGE_VIEW_HANDLE_INFO"
		IMAGE_VIEW_ADDRESS_PROPERTIES.id -> "IMAGE_VIEW_ADDRESS_PROPERTIES"
		TEXTURE_LOD_GATHER_FORMAT_PROPERTIES.id -> "TEXTURE_LOD_GATHER_FORMAT_PROPERTIES"
		STREAM_DESCRIPTOR_SURFACE_CREATE_INFO.id -> "STREAM_DESCRIPTOR_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES.id -> "PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES"
		RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR.id -> "RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR"
		PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR.id -> "PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR"
		PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR"
		EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV.id -> "EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV"
		EXPORT_MEMORY_ALLOCATE_INFO_NV.id -> "EXPORT_MEMORY_ALLOCATE_INFO_NV"
		IMPORT_MEMORY_WIN32_HANDLE_INFO.id -> "IMPORT_MEMORY_WIN32_HANDLE_INFO"
		EXPORT_MEMORY_WIN32_HANDLE_INFO.id -> "EXPORT_MEMORY_WIN32_HANDLE_INFO"
		WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO.id -> "WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO"
		PHYSICAL_DEVICE_FEATURES_2_KHR.id -> "PHYSICAL_DEVICE_FEATURES_2_KHR"
		PHYSICAL_DEVICE_PROPERTIES_2_KHR.id -> "PHYSICAL_DEVICE_PROPERTIES_2_KHR"
		FORMAT_PROPERTIES_2_KHR.id -> "FORMAT_PROPERTIES_2_KHR"
		IMAGE_FORMAT_PROPERTIES_2_KHR.id -> "IMAGE_FORMAT_PROPERTIES_2_KHR"
		PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR.id -> "PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR"
		QUEUE_FAMILY_PROPERTIES_2_KHR.id -> "QUEUE_FAMILY_PROPERTIES_2_KHR"
		PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR.id -> "PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR"
		SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR.id -> "SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR"
		PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR.id -> "PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR"
		MEMORY_ALLOCATE_FLAGS_INFO_KHR.id -> "MEMORY_ALLOCATE_FLAGS_INFO_KHR"
		DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR.id -> "DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR"
		DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR.id -> "DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR"
		DEVICE_GROUP_SUBMIT_INFO_KHR.id -> "DEVICE_GROUP_SUBMIT_INFO_KHR"
		DEVICE_GROUP_BIND_SPARSE_INFO_KHR.id -> "DEVICE_GROUP_BIND_SPARSE_INFO_KHR"
		BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR.id -> "BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR"
		BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR.id -> "BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR"
		VALIDATION_FLAGS.id -> "VALIDATION_FLAGS"
		VI_SURFACE_CREATE_INFO.id -> "VI_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES.id -> "PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES"
		IMAGE_VIEW_ASTC_DECODE_MODE.id -> "IMAGE_VIEW_ASTC_DECODE_MODE"
		PHYSICAL_DEVICE_ASTC_DECODE_FEATURES.id -> "PHYSICAL_DEVICE_ASTC_DECODE_FEATURES"
		PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR"
		DEVICE_GROUP_DEVICE_CREATE_INFO_KHR.id -> "DEVICE_GROUP_DEVICE_CREATE_INFO_KHR"
		PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR.id -> "PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR"
		EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR.id -> "EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR"
		PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR.id -> "PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR"
		EXTERNAL_BUFFER_PROPERTIES_KHR.id -> "EXTERNAL_BUFFER_PROPERTIES_KHR"
		PHYSICAL_DEVICE_ID_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_ID_PROPERTIES_KHR"
		EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR.id -> "EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR"
		EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR.id -> "EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR"
		EXPORT_MEMORY_ALLOCATE_INFO_KHR.id -> "EXPORT_MEMORY_ALLOCATE_INFO_KHR"
		IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR.id -> "IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR"
		EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR.id -> "EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR"
		MEMORY_WIN32_HANDLE_PROPERTIES.id -> "MEMORY_WIN32_HANDLE_PROPERTIES"
		MEMORY_GET_WIN32_HANDLE_INFO.id -> "MEMORY_GET_WIN32_HANDLE_INFO"
		IMPORT_MEMORY_FD_INFO.id -> "IMPORT_MEMORY_FD_INFO"
		MEMORY_FD_PROPERTIES.id -> "MEMORY_FD_PROPERTIES"
		MEMORY_GET_FD_INFO.id -> "MEMORY_GET_FD_INFO"
		WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR.id -> "WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR"
		PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR.id -> "PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR"
		EXTERNAL_SEMAPHORE_PROPERTIES_KHR.id -> "EXTERNAL_SEMAPHORE_PROPERTIES_KHR"
		EXPORT_SEMAPHORE_CREATE_INFO_KHR.id -> "EXPORT_SEMAPHORE_CREATE_INFO_KHR"
		IMPORT_SEMAPHORE_WIN32_HANDLE_INFO.id -> "IMPORT_SEMAPHORE_WIN32_HANDLE_INFO"
		EXPORT_SEMAPHORE_WIN32_HANDLE_INFO.id -> "EXPORT_SEMAPHORE_WIN32_HANDLE_INFO"
		D3D12_FENCE_SUBMIT_INFO.id -> "D3D12_FENCE_SUBMIT_INFO"
		SEMAPHORE_GET_WIN32_HANDLE_INFO.id -> "SEMAPHORE_GET_WIN32_HANDLE_INFO"
		IMPORT_SEMAPHORE_FD_INFO.id -> "IMPORT_SEMAPHORE_FD_INFO"
		SEMAPHORE_GET_FD_INFO.id -> "SEMAPHORE_GET_FD_INFO"
		PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES.id -> "PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES"
		COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO.id -> "COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO"
		PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES.id -> "PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES"
		CONDITIONAL_RENDERING_BEGIN_INFO.id -> "CONDITIONAL_RENDERING_BEGIN_INFO"
		PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR.id -> "PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR"
		PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES.id -> "PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES"
		PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR.id -> "PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR"
		PRESENT_REGIONS.id -> "PRESENT_REGIONS"
		DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR.id -> "DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR"
		PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO"
		SURFACE_CAPABILITIES_2.id -> "SURFACE_CAPABILITIES_2"
		SURFACE_CAPABILITIES2.id -> "SURFACE_CAPABILITIES2"
		DISPLAY_POWER_INFO.id -> "DISPLAY_POWER_INFO"
		DEVICE_EVENT_INFO.id -> "DEVICE_EVENT_INFO"
		DISPLAY_EVENT_INFO.id -> "DISPLAY_EVENT_INFO"
		SWAPCHAIN_COUNTER_CREATE_INFO.id -> "SWAPCHAIN_COUNTER_CREATE_INFO"
		PRESENT_TIMES_INFO.id -> "PRESENT_TIMES_INFO"
		PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES.id -> "PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES"
		PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES.id -> "PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES"
		PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO.id -> "PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES.id -> "PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES"
		PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO.id -> "PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES.id -> "PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES"
		PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO.id -> "PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO"
		HDR_METADATA.id -> "HDR_METADATA"
		PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR.id -> "PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR"
		FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR.id -> "FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR"
		FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR.id -> "FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR"
		RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR.id -> "RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR"
		ATTACHMENT_DESCRIPTION_2_KHR.id -> "ATTACHMENT_DESCRIPTION_2_KHR"
		ATTACHMENT_REFERENCE_2_KHR.id -> "ATTACHMENT_REFERENCE_2_KHR"
		SUBPASS_DESCRIPTION_2_KHR.id -> "SUBPASS_DESCRIPTION_2_KHR"
		SUBPASS_DEPENDENCY_2_KHR.id -> "SUBPASS_DEPENDENCY_2_KHR"
		RENDER_PASS_CREATE_INFO_2_KHR.id -> "RENDER_PASS_CREATE_INFO_2_KHR"
		SUBPASS_BEGIN_INFO_KHR.id -> "SUBPASS_BEGIN_INFO_KHR"
		SUBPASS_END_INFO_KHR.id -> "SUBPASS_END_INFO_KHR"
		SHARED_PRESENT_SURFACE_CAPABILITIES.id -> "SHARED_PRESENT_SURFACE_CAPABILITIES"
		PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR.id -> "PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR"
		EXTERNAL_FENCE_PROPERTIES_KHR.id -> "EXTERNAL_FENCE_PROPERTIES_KHR"
		EXPORT_FENCE_CREATE_INFO_KHR.id -> "EXPORT_FENCE_CREATE_INFO_KHR"
		IMPORT_FENCE_WIN32_HANDLE_INFO.id -> "IMPORT_FENCE_WIN32_HANDLE_INFO"
		EXPORT_FENCE_WIN32_HANDLE_INFO.id -> "EXPORT_FENCE_WIN32_HANDLE_INFO"
		FENCE_GET_WIN32_HANDLE_INFO.id -> "FENCE_GET_WIN32_HANDLE_INFO"
		IMPORT_FENCE_FD_INFO.id -> "IMPORT_FENCE_FD_INFO"
		FENCE_GET_FD_INFO.id -> "FENCE_GET_FD_INFO"
		PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES.id -> "PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES"
		PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES.id -> "PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES"
		QUERY_POOL_PERFORMANCE_CREATE_INFO.id -> "QUERY_POOL_PERFORMANCE_CREATE_INFO"
		PERFORMANCE_QUERY_SUBMIT_INFO.id -> "PERFORMANCE_QUERY_SUBMIT_INFO"
		ACQUIRE_PROFILING_LOCK_INFO.id -> "ACQUIRE_PROFILING_LOCK_INFO"
		PERFORMANCE_COUNTER.id -> "PERFORMANCE_COUNTER"
		PERFORMANCE_COUNTER_DESCRIPTION.id -> "PERFORMANCE_COUNTER_DESCRIPTION"
		PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR"
		RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR.id -> "RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR"
		IMAGE_VIEW_USAGE_CREATE_INFO_KHR.id -> "IMAGE_VIEW_USAGE_CREATE_INFO_KHR"
		PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR.id -> "PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR"
		PHYSICAL_DEVICE_SURFACE_INFO_2.id -> "PHYSICAL_DEVICE_SURFACE_INFO_2"
		SURFACE_CAPABILITIES_2_KHR.id -> "SURFACE_CAPABILITIES_2_KHR"
		SURFACE_FORMAT_2.id -> "SURFACE_FORMAT_2"
		PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR.id -> "PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR"
		PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR.id -> "PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR"
		DISPLAY_PROPERTIES_2.id -> "DISPLAY_PROPERTIES_2"
		DISPLAY_PLANE_PROPERTIES_2.id -> "DISPLAY_PLANE_PROPERTIES_2"
		DISPLAY_MODE_PROPERTIES_2.id -> "DISPLAY_MODE_PROPERTIES_2"
		DISPLAY_PLANE_INFO_2.id -> "DISPLAY_PLANE_INFO_2"
		DISPLAY_PLANE_CAPABILITIES_2.id -> "DISPLAY_PLANE_CAPABILITIES_2"
		IOS_SURFACE_CREATE_INFO.id -> "IOS_SURFACE_CREATE_INFO"
		MACOS_SURFACE_CREATE_INFO.id -> "MACOS_SURFACE_CREATE_INFO"
		MEMORY_DEDICATED_REQUIREMENTS_KHR.id -> "MEMORY_DEDICATED_REQUIREMENTS_KHR"
		MEMORY_DEDICATED_ALLOCATE_INFO_KHR.id -> "MEMORY_DEDICATED_ALLOCATE_INFO_KHR"
		DEBUG_UTILS_OBJECT_NAME_INFO.id -> "DEBUG_UTILS_OBJECT_NAME_INFO"
		DEBUG_UTILS_OBJECT_TAG_INFO.id -> "DEBUG_UTILS_OBJECT_TAG_INFO"
		DEBUG_UTILS_LABEL.id -> "DEBUG_UTILS_LABEL"
		DEBUG_UTILS_MESSENGER_CALLBACK_DATA.id -> "DEBUG_UTILS_MESSENGER_CALLBACK_DATA"
		DEBUG_UTILS_MESSENGER_CREATE_INFO.id -> "DEBUG_UTILS_MESSENGER_CREATE_INFO"
		ANDROID_HARDWARE_BUFFER_USAGE.id -> "ANDROID_HARDWARE_BUFFER_USAGE"
		ANDROID_HARDWARE_BUFFER_PROPERTIES.id -> "ANDROID_HARDWARE_BUFFER_PROPERTIES"
		ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES.id -> "ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES"
		IMPORT_ANDROID_HARDWARE_BUFFER_INFO.id -> "IMPORT_ANDROID_HARDWARE_BUFFER_INFO"
		MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO.id -> "MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO"
		EXTERNAL_FORMAT.id -> "EXTERNAL_FORMAT"
		PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT.id -> "PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT"
		SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT.id -> "SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT"
		PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES.id -> "PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES"
		PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES.id -> "PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES"
		WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK.id -> "WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK"
		DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO.id -> "DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO"
		SAMPLE_LOCATIONS_INFO.id -> "SAMPLE_LOCATIONS_INFO"
		RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO.id -> "RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO"
		PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO.id -> "PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES.id -> "PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES"
		MULTISAMPLE_PROPERTIES.id -> "MULTISAMPLE_PROPERTIES"
		BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR.id -> "BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR"
		IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR.id -> "IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR"
		IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR.id -> "IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR"
		MEMORY_REQUIREMENTS_2_KHR.id -> "MEMORY_REQUIREMENTS_2_KHR"
		SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR.id -> "SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR"
		IMAGE_FORMAT_LIST_CREATE_INFO_KHR.id -> "IMAGE_FORMAT_LIST_CREATE_INFO_KHR"
		PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES.id -> "PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES"
		PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES.id -> "PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES"
		PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO.id -> "PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO"
		PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO.id -> "PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO"
		WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE.id -> "WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE"
		ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO.id -> "ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO"
		ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO.id -> "ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO"
		ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA.id -> "ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA"
		ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA.id -> "ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA"
		ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA.id -> "ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA"
		ACCELERATION_STRUCTURE_GEOMETRY.id -> "ACCELERATION_STRUCTURE_GEOMETRY"
		ACCELERATION_STRUCTURE_VERSION_INFO.id -> "ACCELERATION_STRUCTURE_VERSION_INFO"
		COPY_ACCELERATION_STRUCTURE_INFO.id -> "COPY_ACCELERATION_STRUCTURE_INFO"
		COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO.id -> "COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO"
		COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO.id -> "COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO"
		PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES.id -> "PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES"
		PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES.id -> "PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES"
		ACCELERATION_STRUCTURE_CREATE_INFO.id -> "ACCELERATION_STRUCTURE_CREATE_INFO"
		ACCELERATION_STRUCTURE_BUILD_SIZES_INFO.id -> "ACCELERATION_STRUCTURE_BUILD_SIZES_INFO"
		PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES.id -> "PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES"
		PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES.id -> "PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES"
		RAY_TRACING_PIPELINE_CREATE_INFO.id -> "RAY_TRACING_PIPELINE_CREATE_INFO"
		RAY_TRACING_SHADER_GROUP_CREATE_INFO.id -> "RAY_TRACING_SHADER_GROUP_CREATE_INFO"
		RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO.id -> "RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO"
		PHYSICAL_DEVICE_RAY_QUERY_FEATURES.id -> "PHYSICAL_DEVICE_RAY_QUERY_FEATURES"
		PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO.id -> "PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES"
		PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES.id -> "PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES"
		SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR.id -> "SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR"
		SAMPLER_YCBCR_CONVERSION_INFO_KHR.id -> "SAMPLER_YCBCR_CONVERSION_INFO_KHR"
		BIND_IMAGE_PLANE_MEMORY_INFO_KHR.id -> "BIND_IMAGE_PLANE_MEMORY_INFO_KHR"
		IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR.id -> "IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR"
		PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR.id -> "PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR"
		SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR.id -> "SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR"
		BIND_BUFFER_MEMORY_INFO_KHR.id -> "BIND_BUFFER_MEMORY_INFO_KHR"
		BIND_IMAGE_MEMORY_INFO_KHR.id -> "BIND_IMAGE_MEMORY_INFO_KHR"
		DRM_FORMAT_MODIFIER_PROPERTIES_LIST.id -> "DRM_FORMAT_MODIFIER_PROPERTIES_LIST"
		PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO.id -> "PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO"
		IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO.id -> "IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO"
		IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO.id -> "IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO"
		IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES.id -> "IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES"
		VALIDATION_CACHE_CREATE_INFO.id -> "VALIDATION_CACHE_CREATE_INFO"
		SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO.id -> "SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO"
		DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT.id -> "DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT"
		PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT.id -> "PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT"
		PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT.id -> "PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT"
		DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT.id -> "DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT"
		DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT.id -> "DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT"
		PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES.id -> "PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES"
		PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES.id -> "PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES"
		PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES.id -> "PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES"
		PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES.id -> "PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES"
		PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO"
		RAY_TRACING_PIPELINE_CREATE_INFO_NV.id -> "RAY_TRACING_PIPELINE_CREATE_INFO_NV"
		ACCELERATION_STRUCTURE_CREATE_INFO_NV.id -> "ACCELERATION_STRUCTURE_CREATE_INFO_NV"
		GEOMETRY.id -> "GEOMETRY"
		GEOMETRY_TRIANGLES.id -> "GEOMETRY_TRIANGLES"
		GEOMETRY_AABB.id -> "GEOMETRY_AABB"
		BIND_ACCELERATION_STRUCTURE_MEMORY_INFO.id -> "BIND_ACCELERATION_STRUCTURE_MEMORY_INFO"
		WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV.id -> "WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV"
		ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO.id -> "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO"
		PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES.id -> "PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES"
		RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV.id -> "RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV"
		ACCELERATION_STRUCTURE_INFO.id -> "ACCELERATION_STRUCTURE_INFO"
		PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES.id -> "PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES"
		PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO.id -> "PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR"
		DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR.id -> "DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR"
		PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO.id -> "PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO"
		FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES.id -> "FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES"
		DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO.id -> "DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO"
		PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR.id -> "PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR"
		PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR.id -> "PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR"
		IMPORT_MEMORY_HOST_POINTER_INFO.id -> "IMPORT_MEMORY_HOST_POINTER_INFO"
		MEMORY_HOST_POINTER_PROPERTIES.id -> "MEMORY_HOST_POINTER_PROPERTIES"
		PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES.id -> "PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES"
		PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR.id -> "PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR"
		PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES"
		PIPELINE_COMPILER_CONTROL_CREATE_INFO.id -> "PIPELINE_COMPILER_CONTROL_CREATE_INFO"
		CALIBRATED_TIMESTAMP_INFO.id -> "CALIBRATED_TIMESTAMP_INFO"
		PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES.id -> "PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES"
		DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO.id -> "DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO"
		PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES.id -> "PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES"
		PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO.id -> "PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES.id -> "PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES"
		PRESENT_FRAME_TOKEN.id -> "PRESENT_FRAME_TOKEN"
		PIPELINE_CREATION_FEEDBACK_CREATE_INFO.id -> "PIPELINE_CREATION_FEEDBACK_CREATE_INFO"
		PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR"
		PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR"
		PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR"
		SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR.id -> "SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR"
		PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES.id -> "PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES"
		PHYSICAL_DEVICE_MESH_SHADER_FEATURES.id -> "PHYSICAL_DEVICE_MESH_SHADER_FEATURES"
		PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES.id -> "PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES"
		PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES"
		PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES"
		PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO.id -> "PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES.id -> "PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES"
		CHECKPOINT_DATA.id -> "CHECKPOINT_DATA"
		QUEUE_FAMILY_CHECKPOINT_PROPERTIES.id -> "QUEUE_FAMILY_CHECKPOINT_PROPERTIES"
		PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR.id -> "PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR"
		PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR.id -> "PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR"
		SEMAPHORE_TYPE_CREATE_INFO_KHR.id -> "SEMAPHORE_TYPE_CREATE_INFO_KHR"
		TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR.id -> "TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR"
		SEMAPHORE_WAIT_INFO_KHR.id -> "SEMAPHORE_WAIT_INFO_KHR"
		SEMAPHORE_SIGNAL_INFO_KHR.id -> "SEMAPHORE_SIGNAL_INFO_KHR"
		PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES"
		QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO.id -> "QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO"
		QUERY_POOL_CREATE_INFO_INTEL.id -> "QUERY_POOL_CREATE_INFO_INTEL"
		INITIALIZE_PERFORMANCE_API_INFO.id -> "INITIALIZE_PERFORMANCE_API_INFO"
		PERFORMANCE_MARKER_INFO.id -> "PERFORMANCE_MARKER_INFO"
		PERFORMANCE_STREAM_MARKER_INFO.id -> "PERFORMANCE_STREAM_MARKER_INFO"
		PERFORMANCE_OVERRIDE_INFO.id -> "PERFORMANCE_OVERRIDE_INFO"
		PERFORMANCE_CONFIGURATION_ACQUIRE_INFO.id -> "PERFORMANCE_CONFIGURATION_ACQUIRE_INFO"
		PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR.id -> "PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR"
		PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES.id -> "PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES"
		DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES.id -> "DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES"
		SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO.id -> "SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO"
		IMAGEPIPE_SURFACE_CREATE_INFO.id -> "IMAGEPIPE_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES"
		METAL_SURFACE_CREATE_INFO.id -> "METAL_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES"
		PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES.id -> "PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES"
		RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO.id -> "RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO"
		PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT.id -> "PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT"
		PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES.id -> "PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES"
		PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO.id -> "PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO"
		PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES.id -> "PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES"
		FRAGMENT_SHADING_RATE_ATTACHMENT_INFO.id -> "FRAGMENT_SHADING_RATE_ATTACHMENT_INFO"
		PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO.id -> "PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES"
		PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES"
		PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE"
		PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2.id -> "PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2"
		PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES.id -> "PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES"
		PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES"
		PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES.id -> "PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES"
		PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES.id -> "PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES"
		MEMORY_PRIORITY_ALLOCATE_INFO.id -> "MEMORY_PRIORITY_ALLOCATE_INFO"
		SURFACE_PROTECTED_CAPABILITIES.id -> "SURFACE_PROTECTED_CAPABILITIES"
		PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES.id -> "PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES"
		PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR.id -> "PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR"
		ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR.id -> "ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR"
		ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR.id -> "ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR"
		PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT.id -> "PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT"
		PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES.id -> "PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES"
		BUFFER_DEVICE_ADDRESS_INFO_EXT.id -> "BUFFER_DEVICE_ADDRESS_INFO_EXT"
		BUFFER_DEVICE_ADDRESS_CREATE_INFO.id -> "BUFFER_DEVICE_ADDRESS_CREATE_INFO"
		PHYSICAL_DEVICE_TOOL_PROPERTIES.id -> "PHYSICAL_DEVICE_TOOL_PROPERTIES"
		IMAGE_STENCIL_USAGE_CREATE_INFO_EXT.id -> "IMAGE_STENCIL_USAGE_CREATE_INFO_EXT"
		VALIDATION_FEATURES.id -> "VALIDATION_FEATURES"
		PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES.id -> "PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES"
		COOPERATIVE_MATRIX_PROPERTIES.id -> "COOPERATIVE_MATRIX_PROPERTIES"
		PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES.id -> "PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES"
		PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES.id -> "PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES"
		PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO.id -> "PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO"
		FRAMEBUFFER_MIXED_SAMPLES_COMBINATION.id -> "FRAMEBUFFER_MIXED_SAMPLES_COMBINATION"
		PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES"
		PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES.id -> "PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES"
		PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR.id -> "PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR"
		SURFACE_FULL_SCREEN_EXCLUSIVE_INFO.id -> "SURFACE_FULL_SCREEN_EXCLUSIVE_INFO"
		SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE.id -> "SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE"
		SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO.id -> "SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO"
		HEADLESS_SURFACE_CREATE_INFO.id -> "HEADLESS_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR.id -> "PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR"
		BUFFER_DEVICE_ADDRESS_INFO_KHR.id -> "BUFFER_DEVICE_ADDRESS_INFO_KHR"
		BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR.id -> "BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR"
		MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR.id -> "MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR"
		DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR.id -> "DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR"
		PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES.id -> "PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES"
		PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO.id -> "PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES.id -> "PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES"
		PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES"
		PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT.id -> "PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT"
		PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES.id -> "PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES"
		PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES.id -> "PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES"
		PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES.id -> "PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES"
		PIPELINE_INFO.id -> "PIPELINE_INFO"
		PIPELINE_EXECUTABLE_PROPERTIES.id -> "PIPELINE_EXECUTABLE_PROPERTIES"
		PIPELINE_EXECUTABLE_INFO.id -> "PIPELINE_EXECUTABLE_INFO"
		PIPELINE_EXECUTABLE_STATISTIC.id -> "PIPELINE_EXECUTABLE_STATISTIC"
		PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION.id -> "PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION"
		PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES.id -> "PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES"
		PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES.id -> "PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES"
		GRAPHICS_SHADER_GROUP_CREATE_INFO.id -> "GRAPHICS_SHADER_GROUP_CREATE_INFO"
		GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO.id -> "GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO"
		INDIRECT_COMMANDS_LAYOUT_TOKEN.id -> "INDIRECT_COMMANDS_LAYOUT_TOKEN"
		INDIRECT_COMMANDS_LAYOUT_CREATE_INFO.id -> "INDIRECT_COMMANDS_LAYOUT_CREATE_INFO"
		GENERATED_COMMANDS_INFO.id -> "GENERATED_COMMANDS_INFO"
		GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO.id -> "GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO"
		PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES.id -> "PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES"
		PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES.id -> "PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES"
		PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES.id -> "PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES"
		COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO.id -> "COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO"
		RENDER_PASS_TRANSFORM_BEGIN_INFO.id -> "RENDER_PASS_TRANSFORM_BEGIN_INFO"
		PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES.id -> "PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES"
		DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO.id -> "DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO"
		DEVICE_MEMORY_REPORT_CALLBACK_DATA.id -> "DEVICE_MEMORY_REPORT_CALLBACK_DATA"
		PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES.id -> "PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES"
		PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES.id -> "PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES"
		SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO.id -> "SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO"
		PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES.id -> "PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES"
		PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES.id -> "PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES"
		PIPELINE_LIBRARY_CREATE_INFO.id -> "PIPELINE_LIBRARY_CREATE_INFO"
		PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES.id -> "PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES"
		DEVICE_PRIVATE_DATA_CREATE_INFO.id -> "DEVICE_PRIVATE_DATA_CREATE_INFO"
		PRIVATE_DATA_SLOT_CREATE_INFO.id -> "PRIVATE_DATA_SLOT_CREATE_INFO"
		PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES.id -> "PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES"
		PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES.id -> "PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES"
		DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO.id -> "DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO"
		MEMORY_BARRIER_2.id -> "MEMORY_BARRIER_2"
		BUFFER_MEMORY_BARRIER_2.id -> "BUFFER_MEMORY_BARRIER_2"
		IMAGE_MEMORY_BARRIER_2.id -> "IMAGE_MEMORY_BARRIER_2"
		DEPENDENCY_INFO.id -> "DEPENDENCY_INFO"
		SUBMIT_INFO_2.id -> "SUBMIT_INFO_2"
		SEMAPHORE_SUBMIT_INFO.id -> "SEMAPHORE_SUBMIT_INFO"
		COMMAND_BUFFER_SUBMIT_INFO.id -> "COMMAND_BUFFER_SUBMIT_INFO"
		PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES.id -> "PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES"
		QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2.id -> "QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2"
		CHECKPOINT_DATA_2.id -> "CHECKPOINT_DATA_2"
		PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES.id -> "PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES"
		PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES"
		PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES"
		PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO.id -> "PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO"
		PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES.id -> "PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES"
		PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES.id -> "PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES"
		COPY_COMMAND_TRANSFORM_INFO.id -> "COPY_COMMAND_TRANSFORM_INFO"
		PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES.id -> "PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES"
		PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES.id -> "PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES"
		COPY_BUFFER_INFO_2.id -> "COPY_BUFFER_INFO_2"
		COPY_IMAGE_INFO_2.id -> "COPY_IMAGE_INFO_2"
		COPY_BUFFER_TO_IMAGE_INFO_2.id -> "COPY_BUFFER_TO_IMAGE_INFO_2"
		COPY_IMAGE_TO_BUFFER_INFO_2.id -> "COPY_IMAGE_TO_BUFFER_INFO_2"
		BLIT_IMAGE_INFO_2.id -> "BLIT_IMAGE_INFO_2"
		RESOLVE_IMAGE_INFO_2.id -> "RESOLVE_IMAGE_INFO_2"
		BUFFER_COPY_2.id -> "BUFFER_COPY_2"
		IMAGE_COPY_2.id -> "IMAGE_COPY_2"
		IMAGE_BLIT_2.id -> "IMAGE_BLIT_2"
		BUFFER_IMAGE_COPY_2.id -> "BUFFER_IMAGE_COPY_2"
		IMAGE_RESOLVE_2.id -> "IMAGE_RESOLVE_2"
		PHYSICAL_DEVICE_4444_FORMATS_FEATURES.id -> "PHYSICAL_DEVICE_4444_FORMATS_FEATURES"
		DIRECTFB_SURFACE_CREATE_INFO.id -> "DIRECTFB_SURFACE_CREATE_INFO"
		PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES.id -> "PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES"
		MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO.id -> "MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO"
		IMPORT_MEMORY_ZIRCON_HANDLE_INFO.id -> "IMPORT_MEMORY_ZIRCON_HANDLE_INFO"
		MEMORY_ZIRCON_HANDLE_PROPERTIES.id -> "MEMORY_ZIRCON_HANDLE_PROPERTIES"
		MEMORY_GET_ZIRCON_HANDLE_INFO.id -> "MEMORY_GET_ZIRCON_HANDLE_INFO"
		IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO.id -> "IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO"
		SEMAPHORE_GET_ZIRCON_HANDLE_INFO.id -> "SEMAPHORE_GET_ZIRCON_HANDLE_INFO"
		SCREEN_SURFACE_CREATE_INFO_.id -> "SCREEN_SURFACE_CREATE_INFO_"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val APPLICATION_INFO get() = StructureType(0)
		val INSTANCE_CREATE_INFO get() = StructureType(1)
		val DEVICE_QUEUE_CREATE_INFO get() = StructureType(2)
		val DEVICE_CREATE_INFO get() = StructureType(3)
		val SUBMIT_INFO get() = StructureType(4)
		val MEMORY_ALLOCATE_INFO get() = StructureType(5)
		val MAPPED_MEMORY_RANGE get() = StructureType(6)
		val BIND_SPARSE_INFO get() = StructureType(7)
		val FENCE_CREATE_INFO get() = StructureType(8)
		val SEMAPHORE_CREATE_INFO get() = StructureType(9)
		val EVENT_CREATE_INFO get() = StructureType(10)
		val QUERY_POOL_CREATE_INFO get() = StructureType(11)
		val BUFFER_CREATE_INFO get() = StructureType(12)
		val BUFFER_VIEW_CREATE_INFO get() = StructureType(13)
		val IMAGE_CREATE_INFO get() = StructureType(14)
		val IMAGE_VIEW_CREATE_INFO get() = StructureType(15)
		val SHADER_MODULE_CREATE_INFO get() = StructureType(16)
		val PIPELINE_CACHE_CREATE_INFO get() = StructureType(17)
		val PIPELINE_SHADER_STAGE_CREATE_INFO get() = StructureType(18)
		val PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO get() = StructureType(19)
		val PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO get() = StructureType(20)
		val PIPELINE_TESSELLATION_STATE_CREATE_INFO get() = StructureType(21)
		val PIPELINE_VIEWPORT_STATE_CREATE_INFO get() = StructureType(22)
		val PIPELINE_RASTERIZATION_STATE_CREATE_INFO get() = StructureType(23)
		val PIPELINE_MULTISAMPLE_STATE_CREATE_INFO get() = StructureType(24)
		val PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO get() = StructureType(25)
		val PIPELINE_COLOR_BLEND_STATE_CREATE_INFO get() = StructureType(26)
		val PIPELINE_DYNAMIC_STATE_CREATE_INFO get() = StructureType(27)
		val GRAPHICS_PIPELINE_CREATE_INFO get() = StructureType(28)
		val COMPUTE_PIPELINE_CREATE_INFO get() = StructureType(29)
		val PIPELINE_LAYOUT_CREATE_INFO get() = StructureType(30)
		val SAMPLER_CREATE_INFO get() = StructureType(31)
		val DESCRIPTOR_SET_LAYOUT_CREATE_INFO get() = StructureType(32)
		val DESCRIPTOR_POOL_CREATE_INFO get() = StructureType(33)
		val DESCRIPTOR_SET_ALLOCATE_INFO get() = StructureType(34)
		val WRITE_DESCRIPTOR_SET get() = StructureType(35)
		val COPY_DESCRIPTOR_SET get() = StructureType(36)
		val FRAMEBUFFER_CREATE_INFO get() = StructureType(37)
		val RENDER_PASS_CREATE_INFO get() = StructureType(38)
		val COMMAND_POOL_CREATE_INFO get() = StructureType(39)
		val COMMAND_BUFFER_ALLOCATE_INFO get() = StructureType(40)
		val COMMAND_BUFFER_INHERITANCE_INFO get() = StructureType(41)
		val COMMAND_BUFFER_BEGIN_INFO get() = StructureType(42)
		val RENDER_PASS_BEGIN_INFO get() = StructureType(43)
		val BUFFER_MEMORY_BARRIER get() = StructureType(44)
		val IMAGE_MEMORY_BARRIER get() = StructureType(45)
		val MEMORY_BARRIER get() = StructureType(46)
		val LOADER_INSTANCE_CREATE_INFO get() = StructureType(47)
		val LOADER_DEVICE_CREATE_INFO get() = StructureType(48)
		val PHYSICAL_DEVICE_SUBGROUP_PROPERTIES get() = StructureType(1000094000)
		val BIND_BUFFER_MEMORY_INFO get() = StructureType(1000157000)
		val BIND_IMAGE_MEMORY_INFO get() = StructureType(1000157001)
		val PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES get() = StructureType(1000083000)
		val MEMORY_DEDICATED_REQUIREMENTS get() = StructureType(1000127000)
		val MEMORY_DEDICATED_ALLOCATE_INFO get() = StructureType(1000127001)
		val MEMORY_ALLOCATE_FLAGS_INFO get() = StructureType(1000060000)
		val DEVICE_GROUP_RENDER_PASS_BEGIN_INFO get() = StructureType(1000060003)
		val DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO get() = StructureType(1000060004)
		val DEVICE_GROUP_SUBMIT_INFO get() = StructureType(1000060005)
		val DEVICE_GROUP_BIND_SPARSE_INFO get() = StructureType(1000060006)
		val BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO get() = StructureType(1000060013)
		val BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO get() = StructureType(1000060014)
		val PHYSICAL_DEVICE_GROUP_PROPERTIES get() = StructureType(1000070000)
		val DEVICE_GROUP_DEVICE_CREATE_INFO get() = StructureType(1000070001)
		val BUFFER_MEMORY_REQUIREMENTS_INFO_2 get() = StructureType(1000146000)
		val IMAGE_MEMORY_REQUIREMENTS_INFO_2 get() = StructureType(1000146001)
		val IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 get() = StructureType(1000146002)
		val MEMORY_REQUIREMENTS_2 get() = StructureType(1000146003)
		val SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 get() = StructureType(1000146004)
		val PHYSICAL_DEVICE_FEATURES_2 get() = StructureType(1000059000)
		val PHYSICAL_DEVICE_PROPERTIES_2 get() = StructureType(1000059001)
		val FORMAT_PROPERTIES_2 get() = StructureType(1000059002)
		val IMAGE_FORMAT_PROPERTIES_2 get() = StructureType(1000059003)
		val PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 get() = StructureType(1000059004)
		val QUEUE_FAMILY_PROPERTIES_2 get() = StructureType(1000059005)
		val PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 get() = StructureType(1000059006)
		val SPARSE_IMAGE_FORMAT_PROPERTIES_2 get() = StructureType(1000059007)
		val PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 get() = StructureType(1000059008)
		val PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES get() = StructureType(1000117000)
		val RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO get() = StructureType(1000117001)
		val IMAGE_VIEW_USAGE_CREATE_INFO get() = StructureType(1000117002)
		val PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO get() = StructureType(1000117003)
		val RENDER_PASS_MULTIVIEW_CREATE_INFO get() = StructureType(1000053000)
		val PHYSICAL_DEVICE_MULTIVIEW_FEATURES get() = StructureType(1000053001)
		val PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES get() = StructureType(1000053002)
		val PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES get() = StructureType(1000120000)
		val PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES get() = StructureType(1000120000)
		val PROTECTED_SUBMIT_INFO get() = StructureType(1000145000)
		val PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES get() = StructureType(1000145001)
		val PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES get() = StructureType(1000145002)
		val DEVICE_QUEUE_INFO_2 get() = StructureType(1000145003)
		val SAMPLER_YCBCR_CONVERSION_CREATE_INFO get() = StructureType(1000156000)
		val SAMPLER_YCBCR_CONVERSION_INFO get() = StructureType(1000156001)
		val BIND_IMAGE_PLANE_MEMORY_INFO get() = StructureType(1000156002)
		val IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO get() = StructureType(1000156003)
		val PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES get() = StructureType(1000156004)
		val SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES get() = StructureType(1000156005)
		val DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO get() = StructureType(1000085000)
		val PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO get() = StructureType(1000071000)
		val EXTERNAL_IMAGE_FORMAT_PROPERTIES get() = StructureType(1000071001)
		val PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO get() = StructureType(1000071002)
		val EXTERNAL_BUFFER_PROPERTIES get() = StructureType(1000071003)
		val PHYSICAL_DEVICE_ID_PROPERTIES get() = StructureType(1000071004)
		val EXTERNAL_MEMORY_BUFFER_CREATE_INFO get() = StructureType(1000072000)
		val EXTERNAL_MEMORY_IMAGE_CREATE_INFO get() = StructureType(1000072001)
		val EXPORT_MEMORY_ALLOCATE_INFO get() = StructureType(1000072002)
		val PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO get() = StructureType(1000112000)
		val EXTERNAL_FENCE_PROPERTIES get() = StructureType(1000112001)
		val EXPORT_FENCE_CREATE_INFO get() = StructureType(1000113000)
		val EXPORT_SEMAPHORE_CREATE_INFO get() = StructureType(1000077000)
		val PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO get() = StructureType(1000076000)
		val EXTERNAL_SEMAPHORE_PROPERTIES get() = StructureType(1000076001)
		val PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES get() = StructureType(1000168000)
		val DESCRIPTOR_SET_LAYOUT_SUPPORT get() = StructureType(1000168001)
		val PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES get() = StructureType(1000063000)
		val PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES get() = StructureType(1000063000)
		val PHYSICAL_DEVICE_VULKAN_1_1_FEATURES get() = StructureType(49)
		val PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES get() = StructureType(50)
		val PHYSICAL_DEVICE_VULKAN_1_2_FEATURES get() = StructureType(51)
		val PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES get() = StructureType(52)
		val IMAGE_FORMAT_LIST_CREATE_INFO get() = StructureType(1000147000)
		val ATTACHMENT_DESCRIPTION_2 get() = StructureType(1000109000)
		val ATTACHMENT_REFERENCE_2 get() = StructureType(1000109001)
		val SUBPASS_DESCRIPTION_2 get() = StructureType(1000109002)
		val SUBPASS_DEPENDENCY_2 get() = StructureType(1000109003)
		val RENDER_PASS_CREATE_INFO_2 get() = StructureType(1000109004)
		val SUBPASS_BEGIN_INFO get() = StructureType(1000109005)
		val SUBPASS_END_INFO get() = StructureType(1000109006)
		val PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES get() = StructureType(1000177000)
		val PHYSICAL_DEVICE_DRIVER_PROPERTIES get() = StructureType(1000196000)
		val PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES get() = StructureType(1000180000)
		val PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES get() = StructureType(1000082000)
		val PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES get() = StructureType(1000197000)
		val DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO get() = StructureType(1000161000)
		val PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES get() = StructureType(1000161001)
		val PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES get() = StructureType(1000161002)
		val DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO get() = StructureType(1000161003)
		val DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT get() = StructureType(1000161004)
		val PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES get() = StructureType(1000199000)
		val SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE get() = StructureType(1000199001)
		val PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES get() = StructureType(1000221000)
		val IMAGE_STENCIL_USAGE_CREATE_INFO get() = StructureType(1000246000)
		val PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES get() = StructureType(1000130000)
		val SAMPLER_REDUCTION_MODE_CREATE_INFO get() = StructureType(1000130001)
		val PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES get() = StructureType(1000211000)
		val PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES get() = StructureType(1000108000)
		val FRAMEBUFFER_ATTACHMENTS_CREATE_INFO get() = StructureType(1000108001)
		val FRAMEBUFFER_ATTACHMENT_IMAGE_INFO get() = StructureType(1000108002)
		val RENDER_PASS_ATTACHMENT_BEGIN_INFO get() = StructureType(1000108003)
		val PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES get() = StructureType(1000253000)
		val PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES get() = StructureType(1000175000)
		val PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES get() = StructureType(1000241000)
		val ATTACHMENT_REFERENCE_STENCIL_LAYOUT get() = StructureType(1000241001)
		val ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT get() = StructureType(1000241002)
		val PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES get() = StructureType(1000261000)
		val PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES get() = StructureType(1000207000)
		val PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES get() = StructureType(1000207001)
		val SEMAPHORE_TYPE_CREATE_INFO get() = StructureType(1000207002)
		val TIMELINE_SEMAPHORE_SUBMIT_INFO get() = StructureType(1000207003)
		val SEMAPHORE_WAIT_INFO get() = StructureType(1000207004)
		val SEMAPHORE_SIGNAL_INFO get() = StructureType(1000207005)
		val PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES get() = StructureType(1000257000)
		val BUFFER_DEVICE_ADDRESS_INFO get() = StructureType(1000244001)
		val BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO get() = StructureType(1000257002)
		val MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO get() = StructureType(1000257003)
		val DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO get() = StructureType(1000257004)
		val SWAPCHAIN_CREATE_INFO get() = StructureType(1000001000)
		val PRESENT_INFO get() = StructureType(1000001001)
		val DEVICE_GROUP_PRESENT_CAPABILITIES get() = StructureType(1000060007)
		val IMAGE_SWAPCHAIN_CREATE_INFO get() = StructureType(1000060008)
		val BIND_IMAGE_MEMORY_SWAPCHAIN_INFO get() = StructureType(1000060009)
		val ACQUIRE_NEXT_IMAGE_INFO get() = StructureType(1000060010)
		val DEVICE_GROUP_PRESENT_INFO get() = StructureType(1000060011)
		val DEVICE_GROUP_SWAPCHAIN_CREATE_INFO get() = StructureType(1000060012)
		val DISPLAY_MODE_CREATE_INFO get() = StructureType(1000002000)
		val DISPLAY_SURFACE_CREATE_INFO get() = StructureType(1000002001)
		val DISPLAY_PRESENT_INFO get() = StructureType(1000003000)
		val XLIB_SURFACE_CREATE_INFO get() = StructureType(1000004000)
		val XCB_SURFACE_CREATE_INFO get() = StructureType(1000005000)
		val WAYLAND_SURFACE_CREATE_INFO get() = StructureType(1000006000)
		val ANDROID_SURFACE_CREATE_INFO get() = StructureType(1000008000)
		val WIN32_SURFACE_CREATE_INFO get() = StructureType(1000009000)
		val DEBUG_REPORT_CALLBACK_CREATE_INFO get() = StructureType(1000011000)
		val DEBUG_REPORT_CREATE_INFO get() = StructureType(1000011000)
		val PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER get() = StructureType(1000018000)
		val DEBUG_MARKER_OBJECT_NAME_INFO get() = StructureType(1000022000)
		val DEBUG_MARKER_OBJECT_TAG_INFO get() = StructureType(1000022001)
		val DEBUG_MARKER_MARKER_INFO get() = StructureType(1000022002)
		val DEDICATED_ALLOCATION_IMAGE_CREATE_INFO get() = StructureType(1000026000)
		val DEDICATED_ALLOCATION_BUFFER_CREATE_INFO get() = StructureType(1000026001)
		val DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO get() = StructureType(1000026002)
		val PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES get() = StructureType(1000028000)
		val PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES get() = StructureType(1000028001)
		val PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO get() = StructureType(1000028002)
		val IMAGE_VIEW_HANDLE_INFO get() = StructureType(1000030000)
		val IMAGE_VIEW_ADDRESS_PROPERTIES get() = StructureType(1000030001)
		val TEXTURE_LOD_GATHER_FORMAT_PROPERTIES get() = StructureType(1000041000)
		val STREAM_DESCRIPTOR_SURFACE_CREATE_INFO get() = StructureType(1000049000)
		val PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES get() = StructureType(1000050000)
		val RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR get() = StructureType(1000053000)
		val PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR get() = StructureType(1000053001)
		val PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR get() = StructureType(1000053002)
		val EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV get() = StructureType(1000056000)
		val EXPORT_MEMORY_ALLOCATE_INFO_NV get() = StructureType(1000056001)
		val IMPORT_MEMORY_WIN32_HANDLE_INFO get() = StructureType(1000057000)
		val EXPORT_MEMORY_WIN32_HANDLE_INFO get() = StructureType(1000057001)
		val WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO get() = StructureType(1000058000)
		val PHYSICAL_DEVICE_FEATURES_2_KHR get() = StructureType(1000059000)
		val PHYSICAL_DEVICE_PROPERTIES_2_KHR get() = StructureType(1000059001)
		val FORMAT_PROPERTIES_2_KHR get() = StructureType(1000059002)
		val IMAGE_FORMAT_PROPERTIES_2_KHR get() = StructureType(1000059003)
		val PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR get() = StructureType(1000059004)
		val QUEUE_FAMILY_PROPERTIES_2_KHR get() = StructureType(1000059005)
		val PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR get() = StructureType(1000059006)
		val SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR get() = StructureType(1000059007)
		val PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR get() = StructureType(1000059008)
		val MEMORY_ALLOCATE_FLAGS_INFO_KHR get() = StructureType(1000060000)
		val DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR get() = StructureType(1000060003)
		val DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR get() = StructureType(1000060004)
		val DEVICE_GROUP_SUBMIT_INFO_KHR get() = StructureType(1000060005)
		val DEVICE_GROUP_BIND_SPARSE_INFO_KHR get() = StructureType(1000060006)
		val BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR get() = StructureType(1000060013)
		val BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR get() = StructureType(1000060014)
		val VALIDATION_FLAGS get() = StructureType(1000061000)
		val VI_SURFACE_CREATE_INFO get() = StructureType(1000062000)
		val PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES get() = StructureType(1000066000)
		val IMAGE_VIEW_ASTC_DECODE_MODE get() = StructureType(1000067000)
		val PHYSICAL_DEVICE_ASTC_DECODE_FEATURES get() = StructureType(1000067001)
		val PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR get() = StructureType(1000070000)
		val DEVICE_GROUP_DEVICE_CREATE_INFO_KHR get() = StructureType(1000070001)
		val PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR get() = StructureType(1000071000)
		val EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR get() = StructureType(1000071001)
		val PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR get() = StructureType(1000071002)
		val EXTERNAL_BUFFER_PROPERTIES_KHR get() = StructureType(1000071003)
		val PHYSICAL_DEVICE_ID_PROPERTIES_KHR get() = StructureType(1000071004)
		val EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR get() = StructureType(1000072000)
		val EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR get() = StructureType(1000072001)
		val EXPORT_MEMORY_ALLOCATE_INFO_KHR get() = StructureType(1000072002)
		val IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR get() = StructureType(1000073000)
		val EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR get() = StructureType(1000073001)
		val MEMORY_WIN32_HANDLE_PROPERTIES get() = StructureType(1000073002)
		val MEMORY_GET_WIN32_HANDLE_INFO get() = StructureType(1000073003)
		val IMPORT_MEMORY_FD_INFO get() = StructureType(1000074000)
		val MEMORY_FD_PROPERTIES get() = StructureType(1000074001)
		val MEMORY_GET_FD_INFO get() = StructureType(1000074002)
		val WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR get() = StructureType(1000075000)
		val PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR get() = StructureType(1000076000)
		val EXTERNAL_SEMAPHORE_PROPERTIES_KHR get() = StructureType(1000076001)
		val EXPORT_SEMAPHORE_CREATE_INFO_KHR get() = StructureType(1000077000)
		val IMPORT_SEMAPHORE_WIN32_HANDLE_INFO get() = StructureType(1000078000)
		val EXPORT_SEMAPHORE_WIN32_HANDLE_INFO get() = StructureType(1000078001)
		val D3D12_FENCE_SUBMIT_INFO get() = StructureType(1000078002)
		val SEMAPHORE_GET_WIN32_HANDLE_INFO get() = StructureType(1000078003)
		val IMPORT_SEMAPHORE_FD_INFO get() = StructureType(1000079000)
		val SEMAPHORE_GET_FD_INFO get() = StructureType(1000079001)
		val PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES get() = StructureType(1000080000)
		val COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO get() = StructureType(1000081000)
		val PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES get() = StructureType(1000081001)
		val CONDITIONAL_RENDERING_BEGIN_INFO get() = StructureType(1000081002)
		val PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR get() = StructureType(1000082000)
		val PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES get() = StructureType(1000082000)
		val PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR get() = StructureType(1000083000)
		val PRESENT_REGIONS get() = StructureType(1000084000)
		val DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR get() = StructureType(1000085000)
		val PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO get() = StructureType(1000087000)
		val SURFACE_CAPABILITIES_2 get() = StructureType(1000090000)
		val SURFACE_CAPABILITIES2 get() = StructureType(1000090000)
		val DISPLAY_POWER_INFO get() = StructureType(1000091000)
		val DEVICE_EVENT_INFO get() = StructureType(1000091001)
		val DISPLAY_EVENT_INFO get() = StructureType(1000091002)
		val SWAPCHAIN_COUNTER_CREATE_INFO get() = StructureType(1000091003)
		val PRESENT_TIMES_INFO get() = StructureType(1000092000)
		val PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES get() = StructureType(1000097000)
		val PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO get() = StructureType(1000098000)
		val PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES get() = StructureType(1000099000)
		val PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO get() = StructureType(1000099001)
		val PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES get() = StructureType(1000101000)
		val PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO get() = StructureType(1000101001)
		val PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES get() = StructureType(1000102000)
		val PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO get() = StructureType(1000102001)
		val HDR_METADATA get() = StructureType(1000105000)
		val PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR get() = StructureType(1000108000)
		val FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR get() = StructureType(1000108001)
		val FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR get() = StructureType(1000108002)
		val RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR get() = StructureType(1000108003)
		val ATTACHMENT_DESCRIPTION_2_KHR get() = StructureType(1000109000)
		val ATTACHMENT_REFERENCE_2_KHR get() = StructureType(1000109001)
		val SUBPASS_DESCRIPTION_2_KHR get() = StructureType(1000109002)
		val SUBPASS_DEPENDENCY_2_KHR get() = StructureType(1000109003)
		val RENDER_PASS_CREATE_INFO_2_KHR get() = StructureType(1000109004)
		val SUBPASS_BEGIN_INFO_KHR get() = StructureType(1000109005)
		val SUBPASS_END_INFO_KHR get() = StructureType(1000109006)
		val SHARED_PRESENT_SURFACE_CAPABILITIES get() = StructureType(1000111000)
		val PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR get() = StructureType(1000112000)
		val EXTERNAL_FENCE_PROPERTIES_KHR get() = StructureType(1000112001)
		val EXPORT_FENCE_CREATE_INFO_KHR get() = StructureType(1000113000)
		val IMPORT_FENCE_WIN32_HANDLE_INFO get() = StructureType(1000114000)
		val EXPORT_FENCE_WIN32_HANDLE_INFO get() = StructureType(1000114001)
		val FENCE_GET_WIN32_HANDLE_INFO get() = StructureType(1000114002)
		val IMPORT_FENCE_FD_INFO get() = StructureType(1000115000)
		val FENCE_GET_FD_INFO get() = StructureType(1000115001)
		val PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES get() = StructureType(1000116000)
		val PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES get() = StructureType(1000116001)
		val QUERY_POOL_PERFORMANCE_CREATE_INFO get() = StructureType(1000116002)
		val PERFORMANCE_QUERY_SUBMIT_INFO get() = StructureType(1000116003)
		val ACQUIRE_PROFILING_LOCK_INFO get() = StructureType(1000116004)
		val PERFORMANCE_COUNTER get() = StructureType(1000116005)
		val PERFORMANCE_COUNTER_DESCRIPTION get() = StructureType(1000116006)
		val PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR get() = StructureType(1000117000)
		val RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR get() = StructureType(1000117001)
		val IMAGE_VIEW_USAGE_CREATE_INFO_KHR get() = StructureType(1000117002)
		val PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR get() = StructureType(1000117003)
		val PHYSICAL_DEVICE_SURFACE_INFO_2 get() = StructureType(1000119000)
		val SURFACE_CAPABILITIES_2_KHR get() = StructureType(1000119001)
		val SURFACE_FORMAT_2 get() = StructureType(1000119002)
		val PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR get() = StructureType(1000120000)
		val PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR get() = StructureType(1000120000)
		val DISPLAY_PROPERTIES_2 get() = StructureType(1000121000)
		val DISPLAY_PLANE_PROPERTIES_2 get() = StructureType(1000121001)
		val DISPLAY_MODE_PROPERTIES_2 get() = StructureType(1000121002)
		val DISPLAY_PLANE_INFO_2 get() = StructureType(1000121003)
		val DISPLAY_PLANE_CAPABILITIES_2 get() = StructureType(1000121004)
		val IOS_SURFACE_CREATE_INFO get() = StructureType(1000122000)
		val MACOS_SURFACE_CREATE_INFO get() = StructureType(1000123000)
		val MEMORY_DEDICATED_REQUIREMENTS_KHR get() = StructureType(1000127000)
		val MEMORY_DEDICATED_ALLOCATE_INFO_KHR get() = StructureType(1000127001)
		val DEBUG_UTILS_OBJECT_NAME_INFO get() = StructureType(1000128000)
		val DEBUG_UTILS_OBJECT_TAG_INFO get() = StructureType(1000128001)
		val DEBUG_UTILS_LABEL get() = StructureType(1000128002)
		val DEBUG_UTILS_MESSENGER_CALLBACK_DATA get() = StructureType(1000128003)
		val DEBUG_UTILS_MESSENGER_CREATE_INFO get() = StructureType(1000128004)
		val ANDROID_HARDWARE_BUFFER_USAGE get() = StructureType(1000129000)
		val ANDROID_HARDWARE_BUFFER_PROPERTIES get() = StructureType(1000129001)
		val ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES get() = StructureType(1000129002)
		val IMPORT_ANDROID_HARDWARE_BUFFER_INFO get() = StructureType(1000129003)
		val MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO get() = StructureType(1000129004)
		val EXTERNAL_FORMAT get() = StructureType(1000129005)
		val PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT get() = StructureType(1000130000)
		val SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT get() = StructureType(1000130001)
		val PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES get() = StructureType(1000138000)
		val PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES get() = StructureType(1000138001)
		val WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK get() = StructureType(1000138002)
		val DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO get() = StructureType(1000138003)
		val SAMPLE_LOCATIONS_INFO get() = StructureType(1000143000)
		val RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO get() = StructureType(1000143001)
		val PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO get() = StructureType(1000143002)
		val PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES get() = StructureType(1000143003)
		val MULTISAMPLE_PROPERTIES get() = StructureType(1000143004)
		val BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR get() = StructureType(1000146000)
		val IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR get() = StructureType(1000146001)
		val IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR get() = StructureType(1000146002)
		val MEMORY_REQUIREMENTS_2_KHR get() = StructureType(1000146003)
		val SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR get() = StructureType(1000146004)
		val IMAGE_FORMAT_LIST_CREATE_INFO_KHR get() = StructureType(1000147000)
		val PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES get() = StructureType(1000148000)
		val PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES get() = StructureType(1000148001)
		val PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO get() = StructureType(1000148002)
		val PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO get() = StructureType(1000149000)
		val WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE get() = StructureType(1000150007)
		val ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO get() = StructureType(1000150000)
		val ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO get() = StructureType(1000150002)
		val ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA get() = StructureType(1000150003)
		val ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA get() = StructureType(1000150004)
		val ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA get() = StructureType(1000150005)
		val ACCELERATION_STRUCTURE_GEOMETRY get() = StructureType(1000150006)
		val ACCELERATION_STRUCTURE_VERSION_INFO get() = StructureType(1000150009)
		val COPY_ACCELERATION_STRUCTURE_INFO get() = StructureType(1000150010)
		val COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO get() = StructureType(1000150011)
		val COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO get() = StructureType(1000150012)
		val PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES get() = StructureType(1000150013)
		val PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES get() = StructureType(1000150014)
		val ACCELERATION_STRUCTURE_CREATE_INFO get() = StructureType(1000150017)
		val ACCELERATION_STRUCTURE_BUILD_SIZES_INFO get() = StructureType(1000150020)
		val PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES get() = StructureType(1000347000)
		val PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES get() = StructureType(1000347001)
		val RAY_TRACING_PIPELINE_CREATE_INFO get() = StructureType(1000150015)
		val RAY_TRACING_SHADER_GROUP_CREATE_INFO get() = StructureType(1000150016)
		val RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO get() = StructureType(1000150018)
		val PHYSICAL_DEVICE_RAY_QUERY_FEATURES get() = StructureType(1000348013)
		val PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO get() = StructureType(1000152000)
		val PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES get() = StructureType(1000154000)
		val PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES get() = StructureType(1000154001)
		val SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR get() = StructureType(1000156000)
		val SAMPLER_YCBCR_CONVERSION_INFO_KHR get() = StructureType(1000156001)
		val BIND_IMAGE_PLANE_MEMORY_INFO_KHR get() = StructureType(1000156002)
		val IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR get() = StructureType(1000156003)
		val PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR get() = StructureType(1000156004)
		val SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR get() = StructureType(1000156005)
		val BIND_BUFFER_MEMORY_INFO_KHR get() = StructureType(1000157000)
		val BIND_IMAGE_MEMORY_INFO_KHR get() = StructureType(1000157001)
		val DRM_FORMAT_MODIFIER_PROPERTIES_LIST get() = StructureType(1000158000)
		val PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO get() = StructureType(1000158002)
		val IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO get() = StructureType(1000158003)
		val IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO get() = StructureType(1000158004)
		val IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES get() = StructureType(1000158005)
		val VALIDATION_CACHE_CREATE_INFO get() = StructureType(1000160000)
		val SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO get() = StructureType(1000160001)
		val DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT get() = StructureType(1000161000)
		val PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT get() = StructureType(1000161001)
		val PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT get() = StructureType(1000161002)
		val DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT get() = StructureType(1000161003)
		val DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT get() = StructureType(1000161004)
		val PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES get() = StructureType(1000163000)
		val PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES get() = StructureType(1000163001)
		val PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO get() = StructureType(1000164000)
		val PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES get() = StructureType(1000164001)
		val PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES get() = StructureType(1000164002)
		val PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO get() = StructureType(1000164005)
		val RAY_TRACING_PIPELINE_CREATE_INFO_NV get() = StructureType(1000165000)
		val ACCELERATION_STRUCTURE_CREATE_INFO_NV get() = StructureType(1000165001)
		val GEOMETRY get() = StructureType(1000165003)
		val GEOMETRY_TRIANGLES get() = StructureType(1000165004)
		val GEOMETRY_AABB get() = StructureType(1000165005)
		val BIND_ACCELERATION_STRUCTURE_MEMORY_INFO get() = StructureType(1000165006)
		val WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV get() = StructureType(1000165007)
		val ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO get() = StructureType(1000165008)
		val PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES get() = StructureType(1000165009)
		val RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV get() = StructureType(1000165011)
		val ACCELERATION_STRUCTURE_INFO get() = StructureType(1000165012)
		val PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES get() = StructureType(1000166000)
		val PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO get() = StructureType(1000166001)
		val PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR get() = StructureType(1000168000)
		val DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR get() = StructureType(1000168001)
		val PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO get() = StructureType(1000170000)
		val FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES get() = StructureType(1000170001)
		val DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO get() = StructureType(1000174000)
		val PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR get() = StructureType(1000175000)
		val PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR get() = StructureType(1000177000)
		val IMPORT_MEMORY_HOST_POINTER_INFO get() = StructureType(1000178000)
		val MEMORY_HOST_POINTER_PROPERTIES get() = StructureType(1000178001)
		val PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES get() = StructureType(1000178002)
		val PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR get() = StructureType(1000180000)
		val PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES get() = StructureType(1000181000)
		val PIPELINE_COMPILER_CONTROL_CREATE_INFO get() = StructureType(1000183000)
		val CALIBRATED_TIMESTAMP_INFO get() = StructureType(1000184000)
		val PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES get() = StructureType(1000185000)
		val DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO get() = StructureType(1000189000)
		val PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES get() = StructureType(1000190000)
		val PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO get() = StructureType(1000190001)
		val PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES get() = StructureType(1000190002)
		val PRESENT_FRAME_TOKEN get() = StructureType(1000191000)
		val PIPELINE_CREATION_FEEDBACK_CREATE_INFO get() = StructureType(1000192000)
		val PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR get() = StructureType(1000196000)
		val PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR get() = StructureType(1000197000)
		val PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR get() = StructureType(1000199000)
		val SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR get() = StructureType(1000199001)
		val PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES get() = StructureType(1000201000)
		val PHYSICAL_DEVICE_MESH_SHADER_FEATURES get() = StructureType(1000202000)
		val PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES get() = StructureType(1000202001)
		val PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES get() = StructureType(1000203000)
		val PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES get() = StructureType(1000204000)
		val PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO get() = StructureType(1000205000)
		val PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES get() = StructureType(1000205002)
		val CHECKPOINT_DATA get() = StructureType(1000206000)
		val QUEUE_FAMILY_CHECKPOINT_PROPERTIES get() = StructureType(1000206001)
		val PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR get() = StructureType(1000207000)
		val PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR get() = StructureType(1000207001)
		val SEMAPHORE_TYPE_CREATE_INFO_KHR get() = StructureType(1000207002)
		val TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR get() = StructureType(1000207003)
		val SEMAPHORE_WAIT_INFO_KHR get() = StructureType(1000207004)
		val SEMAPHORE_SIGNAL_INFO_KHR get() = StructureType(1000207005)
		val PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES get() = StructureType(1000209000)
		val QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO get() = StructureType(1000210000)
		val QUERY_POOL_CREATE_INFO_INTEL get() = StructureType(1000210000)
		val INITIALIZE_PERFORMANCE_API_INFO get() = StructureType(1000210001)
		val PERFORMANCE_MARKER_INFO get() = StructureType(1000210002)
		val PERFORMANCE_STREAM_MARKER_INFO get() = StructureType(1000210003)
		val PERFORMANCE_OVERRIDE_INFO get() = StructureType(1000210004)
		val PERFORMANCE_CONFIGURATION_ACQUIRE_INFO get() = StructureType(1000210005)
		val PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR get() = StructureType(1000211000)
		val PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES get() = StructureType(1000212000)
		val DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES get() = StructureType(1000213000)
		val SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO get() = StructureType(1000213001)
		val IMAGEPIPE_SURFACE_CREATE_INFO get() = StructureType(1000214000)
		val PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES get() = StructureType(1000215000)
		val METAL_SURFACE_CREATE_INFO get() = StructureType(1000217000)
		val PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES get() = StructureType(1000218000)
		val PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES get() = StructureType(1000218001)
		val RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO get() = StructureType(1000218002)
		val PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT get() = StructureType(1000221000)
		val PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES get() = StructureType(1000225000)
		val PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO get() = StructureType(1000225001)
		val PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES get() = StructureType(1000225002)
		val FRAGMENT_SHADING_RATE_ATTACHMENT_INFO get() = StructureType(1000226000)
		val PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO get() = StructureType(1000226001)
		val PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES get() = StructureType(1000226002)
		val PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES get() = StructureType(1000226003)
		val PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE get() = StructureType(1000226004)
		val PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2 get() = StructureType(1000227000)
		val PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES get() = StructureType(1000229000)
		val PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES get() = StructureType(1000234000)
		val PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES get() = StructureType(1000237000)
		val PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES get() = StructureType(1000238000)
		val MEMORY_PRIORITY_ALLOCATE_INFO get() = StructureType(1000238001)
		val SURFACE_PROTECTED_CAPABILITIES get() = StructureType(1000239000)
		val PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES get() = StructureType(1000240000)
		val PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR get() = StructureType(1000241000)
		val ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR get() = StructureType(1000241001)
		val ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR get() = StructureType(1000241002)
		val PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT get() = StructureType(1000244000)
		val PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES get() = StructureType(1000244000)
		val BUFFER_DEVICE_ADDRESS_INFO_EXT get() = StructureType(1000244001)
		val BUFFER_DEVICE_ADDRESS_CREATE_INFO get() = StructureType(1000244002)
		val PHYSICAL_DEVICE_TOOL_PROPERTIES get() = StructureType(1000245000)
		val IMAGE_STENCIL_USAGE_CREATE_INFO_EXT get() = StructureType(1000246000)
		val VALIDATION_FEATURES get() = StructureType(1000247000)
		val PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES get() = StructureType(1000249000)
		val COOPERATIVE_MATRIX_PROPERTIES get() = StructureType(1000249001)
		val PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES get() = StructureType(1000249002)
		val PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES get() = StructureType(1000250000)
		val PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO get() = StructureType(1000250001)
		val FRAMEBUFFER_MIXED_SAMPLES_COMBINATION get() = StructureType(1000250002)
		val PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES get() = StructureType(1000251000)
		val PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES get() = StructureType(1000252000)
		val PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR get() = StructureType(1000253000)
		val SURFACE_FULL_SCREEN_EXCLUSIVE_INFO get() = StructureType(1000255000)
		val SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE get() = StructureType(1000255002)
		val SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO get() = StructureType(1000255001)
		val HEADLESS_SURFACE_CREATE_INFO get() = StructureType(1000256000)
		val PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR get() = StructureType(1000257000)
		val BUFFER_DEVICE_ADDRESS_INFO_KHR get() = StructureType(1000244001)
		val BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR get() = StructureType(1000257002)
		val MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR get() = StructureType(1000257003)
		val DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR get() = StructureType(1000257004)
		val PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES get() = StructureType(1000259000)
		val PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO get() = StructureType(1000259001)
		val PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES get() = StructureType(1000259002)
		val PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES get() = StructureType(1000260000)
		val PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT get() = StructureType(1000261000)
		val PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES get() = StructureType(1000265000)
		val PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES get() = StructureType(1000267000)
		val PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES get() = StructureType(1000269000)
		val PIPELINE_INFO get() = StructureType(1000269001)
		val PIPELINE_EXECUTABLE_PROPERTIES get() = StructureType(1000269002)
		val PIPELINE_EXECUTABLE_INFO get() = StructureType(1000269003)
		val PIPELINE_EXECUTABLE_STATISTIC get() = StructureType(1000269004)
		val PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION get() = StructureType(1000269005)
		val PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES get() = StructureType(1000276000)
		val PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES get() = StructureType(1000277000)
		val GRAPHICS_SHADER_GROUP_CREATE_INFO get() = StructureType(1000277001)
		val GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO get() = StructureType(1000277002)
		val INDIRECT_COMMANDS_LAYOUT_TOKEN get() = StructureType(1000277003)
		val INDIRECT_COMMANDS_LAYOUT_CREATE_INFO get() = StructureType(1000277004)
		val GENERATED_COMMANDS_INFO get() = StructureType(1000277005)
		val GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO get() = StructureType(1000277006)
		val PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES get() = StructureType(1000277007)
		val PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES get() = StructureType(1000281000)
		val PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES get() = StructureType(1000281001)
		val COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO get() = StructureType(1000282000)
		val RENDER_PASS_TRANSFORM_BEGIN_INFO get() = StructureType(1000282001)
		val PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES get() = StructureType(1000284000)
		val DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO get() = StructureType(1000284001)
		val DEVICE_MEMORY_REPORT_CALLBACK_DATA get() = StructureType(1000284002)
		val PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES get() = StructureType(1000286000)
		val PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES get() = StructureType(1000286001)
		val SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO get() = StructureType(1000287000)
		val PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES get() = StructureType(1000287001)
		val PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES get() = StructureType(1000287002)
		val PIPELINE_LIBRARY_CREATE_INFO get() = StructureType(1000290000)
		val PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES get() = StructureType(1000295000)
		val DEVICE_PRIVATE_DATA_CREATE_INFO get() = StructureType(1000295001)
		val PRIVATE_DATA_SLOT_CREATE_INFO get() = StructureType(1000295002)
		val PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES get() = StructureType(1000297000)
		val PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES get() = StructureType(1000300000)
		val DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO get() = StructureType(1000300001)
		val MEMORY_BARRIER_2 get() = StructureType(1000314000)
		val BUFFER_MEMORY_BARRIER_2 get() = StructureType(1000314001)
		val IMAGE_MEMORY_BARRIER_2 get() = StructureType(1000314002)
		val DEPENDENCY_INFO get() = StructureType(1000314003)
		val SUBMIT_INFO_2 get() = StructureType(1000314004)
		val SEMAPHORE_SUBMIT_INFO get() = StructureType(1000314005)
		val COMMAND_BUFFER_SUBMIT_INFO get() = StructureType(1000314006)
		val PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES get() = StructureType(1000314007)
		val QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2 get() = StructureType(1000314008)
		val CHECKPOINT_DATA_2 get() = StructureType(1000314009)
		val PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES get() = StructureType(1000325000)
		val PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES get() = StructureType(1000326000)
		val PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES get() = StructureType(1000326001)
		val PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO get() = StructureType(1000326002)
		val PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES get() = StructureType(1000332000)
		val PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES get() = StructureType(1000332001)
		val COPY_COMMAND_TRANSFORM_INFO get() = StructureType(1000333000)
		val PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES get() = StructureType(1000335000)
		val PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES get() = StructureType(1000336000)
		val COPY_BUFFER_INFO_2 get() = StructureType(1000337000)
		val COPY_IMAGE_INFO_2 get() = StructureType(1000337001)
		val COPY_BUFFER_TO_IMAGE_INFO_2 get() = StructureType(1000337002)
		val COPY_IMAGE_TO_BUFFER_INFO_2 get() = StructureType(1000337003)
		val BLIT_IMAGE_INFO_2 get() = StructureType(1000337004)
		val RESOLVE_IMAGE_INFO_2 get() = StructureType(1000337005)
		val BUFFER_COPY_2 get() = StructureType(1000337006)
		val IMAGE_COPY_2 get() = StructureType(1000337007)
		val IMAGE_BLIT_2 get() = StructureType(1000337008)
		val BUFFER_IMAGE_COPY_2 get() = StructureType(1000337009)
		val IMAGE_RESOLVE_2 get() = StructureType(1000337010)
		val PHYSICAL_DEVICE_4444_FORMATS_FEATURES get() = StructureType(1000340000)
		val DIRECTFB_SURFACE_CREATE_INFO get() = StructureType(1000346000)
		val PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES get() = StructureType(1000351000)
		val MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO get() = StructureType(1000351002)
		val IMPORT_MEMORY_ZIRCON_HANDLE_INFO get() = StructureType(1000364000)
		val MEMORY_ZIRCON_HANDLE_PROPERTIES get() = StructureType(1000364001)
		val MEMORY_GET_ZIRCON_HANDLE_INFO get() = StructureType(1000364002)
		val IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO get() = StructureType(1000365000)
		val SEMAPHORE_GET_ZIRCON_HANDLE_INFO get() = StructureType(1000365001)
		val SCREEN_SURFACE_CREATE_INFO_ get() = StructureType(1000378000)
	
	}


}