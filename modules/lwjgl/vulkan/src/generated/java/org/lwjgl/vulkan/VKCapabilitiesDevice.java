/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Reports the enabled capabilities and function pointers of a Vulkan {@code VkDevice}.
 * 
 * <p>The addresses are cached for future use. This class also allows developers to query the capabilities made available to the Vulkan device handle.</p>
 */
@SuppressWarnings("SimplifiableIfStatement")
public class VKCapabilitiesDevice {

    /** Function pointers for VK10 */
    public final long
        vkGetDeviceProcAddr,
        vkDestroyDevice,
        vkGetDeviceQueue,
        vkQueueSubmit,
        vkQueueWaitIdle,
        vkDeviceWaitIdle,
        vkAllocateMemory,
        vkFreeMemory,
        vkMapMemory,
        vkUnmapMemory,
        vkFlushMappedMemoryRanges,
        vkInvalidateMappedMemoryRanges,
        vkGetDeviceMemoryCommitment,
        vkBindBufferMemory,
        vkBindImageMemory,
        vkGetBufferMemoryRequirements,
        vkGetImageMemoryRequirements,
        vkGetImageSparseMemoryRequirements,
        vkQueueBindSparse,
        vkCreateFence,
        vkDestroyFence,
        vkResetFences,
        vkGetFenceStatus,
        vkWaitForFences,
        vkCreateSemaphore,
        vkDestroySemaphore,
        vkCreateEvent,
        vkDestroyEvent,
        vkGetEventStatus,
        vkSetEvent,
        vkResetEvent,
        vkCreateQueryPool,
        vkDestroyQueryPool,
        vkGetQueryPoolResults,
        vkCreateBuffer,
        vkDestroyBuffer,
        vkCreateBufferView,
        vkDestroyBufferView,
        vkCreateImage,
        vkDestroyImage,
        vkGetImageSubresourceLayout,
        vkCreateImageView,
        vkDestroyImageView,
        vkCreateShaderModule,
        vkDestroyShaderModule,
        vkCreatePipelineCache,
        vkDestroyPipelineCache,
        vkGetPipelineCacheData,
        vkMergePipelineCaches,
        vkCreateGraphicsPipelines,
        vkCreateComputePipelines,
        vkDestroyPipeline,
        vkCreatePipelineLayout,
        vkDestroyPipelineLayout,
        vkCreateSampler,
        vkDestroySampler,
        vkCreateDescriptorSetLayout,
        vkDestroyDescriptorSetLayout,
        vkCreateDescriptorPool,
        vkDestroyDescriptorPool,
        vkResetDescriptorPool,
        vkAllocateDescriptorSets,
        vkFreeDescriptorSets,
        vkUpdateDescriptorSets,
        vkCreateFramebuffer,
        vkDestroyFramebuffer,
        vkCreateRenderPass,
        vkDestroyRenderPass,
        vkGetRenderAreaGranularity,
        vkCreateCommandPool,
        vkDestroyCommandPool,
        vkResetCommandPool,
        vkAllocateCommandBuffers,
        vkFreeCommandBuffers,
        vkBeginCommandBuffer,
        vkEndCommandBuffer,
        vkResetCommandBuffer,
        vkCmdBindPipeline,
        vkCmdSetViewport,
        vkCmdSetScissor,
        vkCmdSetLineWidth,
        vkCmdSetDepthBias,
        vkCmdSetBlendConstants,
        vkCmdSetDepthBounds,
        vkCmdSetStencilCompareMask,
        vkCmdSetStencilWriteMask,
        vkCmdSetStencilReference,
        vkCmdBindDescriptorSets,
        vkCmdBindIndexBuffer,
        vkCmdBindVertexBuffers,
        vkCmdDraw,
        vkCmdDrawIndexed,
        vkCmdDrawIndirect,
        vkCmdDrawIndexedIndirect,
        vkCmdDispatch,
        vkCmdDispatchIndirect,
        vkCmdCopyBuffer,
        vkCmdCopyImage,
        vkCmdBlitImage,
        vkCmdCopyBufferToImage,
        vkCmdCopyImageToBuffer,
        vkCmdUpdateBuffer,
        vkCmdFillBuffer,
        vkCmdClearColorImage,
        vkCmdClearDepthStencilImage,
        vkCmdClearAttachments,
        vkCmdResolveImage,
        vkCmdSetEvent,
        vkCmdResetEvent,
        vkCmdWaitEvents,
        vkCmdPipelineBarrier,
        vkCmdBeginQuery,
        vkCmdEndQuery,
        vkCmdResetQueryPool,
        vkCmdWriteTimestamp,
        vkCmdCopyQueryPoolResults,
        vkCmdPushConstants,
        vkCmdBeginRenderPass,
        vkCmdNextSubpass,
        vkCmdEndRenderPass,
        vkCmdExecuteCommands;

    /** Function pointers for VK11 */
    public final long
        vkBindBufferMemory2,
        vkBindImageMemory2,
        vkGetDeviceGroupPeerMemoryFeatures,
        vkCmdSetDeviceMask,
        vkCmdDispatchBase,
        vkGetImageMemoryRequirements2,
        vkGetBufferMemoryRequirements2,
        vkGetImageSparseMemoryRequirements2,
        vkTrimCommandPool,
        vkGetDeviceQueue2,
        vkCreateSamplerYcbcrConversion,
        vkDestroySamplerYcbcrConversion,
        vkCreateDescriptorUpdateTemplate,
        vkDestroyDescriptorUpdateTemplate,
        vkUpdateDescriptorSetWithTemplate,
        vkGetDescriptorSetLayoutSupport;

    /** Function pointers for VK12 */
    public final long
        vkCmdDrawIndirectCount,
        vkCmdDrawIndexedIndirectCount,
        vkCreateRenderPass2,
        vkCmdBeginRenderPass2,
        vkCmdNextSubpass2,
        vkCmdEndRenderPass2,
        vkResetQueryPool,
        vkGetSemaphoreCounterValue,
        vkWaitSemaphores,
        vkSignalSemaphore,
        vkGetBufferDeviceAddress,
        vkGetBufferOpaqueCaptureAddress,
        vkGetDeviceMemoryOpaqueCaptureAddress;

    /** Function pointers for VK13 */
    public final long
        vkCreatePrivateDataSlot,
        vkDestroyPrivateDataSlot,
        vkSetPrivateData,
        vkGetPrivateData,
        vkCmdSetEvent2,
        vkCmdResetEvent2,
        vkCmdWaitEvents2,
        vkCmdPipelineBarrier2,
        vkCmdWriteTimestamp2,
        vkQueueSubmit2,
        vkCmdCopyBuffer2,
        vkCmdCopyImage2,
        vkCmdCopyBufferToImage2,
        vkCmdCopyImageToBuffer2,
        vkCmdBlitImage2,
        vkCmdResolveImage2,
        vkCmdBeginRendering,
        vkCmdEndRendering,
        vkCmdSetCullMode,
        vkCmdSetFrontFace,
        vkCmdSetPrimitiveTopology,
        vkCmdSetViewportWithCount,
        vkCmdSetScissorWithCount,
        vkCmdBindVertexBuffers2,
        vkCmdSetDepthTestEnable,
        vkCmdSetDepthWriteEnable,
        vkCmdSetDepthCompareOp,
        vkCmdSetDepthBoundsTestEnable,
        vkCmdSetStencilTestEnable,
        vkCmdSetStencilOp,
        vkCmdSetRasterizerDiscardEnable,
        vkCmdSetDepthBiasEnable,
        vkCmdSetPrimitiveRestartEnable,
        vkGetDeviceBufferMemoryRequirements,
        vkGetDeviceImageMemoryRequirements,
        vkGetDeviceImageSparseMemoryRequirements;

    /** Function pointers for AMD_anti_lag */
    public final long
        vkAntiLagUpdateAMD;

    /** Function pointers for AMD_buffer_marker */
    public final long
        vkCmdWriteBufferMarkerAMD;

    /** Function pointers for AMD_display_native_hdr */
    public final long
        vkSetLocalDimmingAMD;

    /** Function pointers for AMD_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountAMD,
        vkCmdDrawIndexedIndirectCountAMD;

    /** Function pointers for AMD_shader_info */
    public final long
        vkGetShaderInfoAMD;

    /** Function pointers for AMDX_shader_enqueue */
    public final long
        vkCreateExecutionGraphPipelinesAMDX,
        vkGetExecutionGraphPipelineScratchSizeAMDX,
        vkGetExecutionGraphPipelineNodeIndexAMDX,
        vkCmdInitializeGraphScratchMemoryAMDX,
        vkCmdDispatchGraphAMDX,
        vkCmdDispatchGraphIndirectAMDX,
        vkCmdDispatchGraphIndirectCountAMDX;

    /** Function pointers for ANDROID_external_memory_android_hardware_buffer */
    public final long
        vkGetAndroidHardwareBufferPropertiesANDROID,
        vkGetMemoryAndroidHardwareBufferANDROID;

    /** Function pointers for EXT_attachment_feedback_loop_dynamic_state */
    public final long
        vkCmdSetAttachmentFeedbackLoopEnableEXT;

    /** Function pointers for EXT_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressEXT;

    /** Function pointers for EXT_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsEXT;

    /** Function pointers for EXT_color_write_enable */
    public final long
        vkCmdSetColorWriteEnableEXT;

    /** Function pointers for EXT_conditional_rendering */
    public final long
        vkCmdBeginConditionalRenderingEXT,
        vkCmdEndConditionalRenderingEXT;

    /** Function pointers for EXT_debug_marker */
    public final long
        vkDebugMarkerSetObjectTagEXT,
        vkDebugMarkerSetObjectNameEXT,
        vkCmdDebugMarkerBeginEXT,
        vkCmdDebugMarkerEndEXT,
        vkCmdDebugMarkerInsertEXT;

    /** Function pointers for EXT_depth_bias_control */
    public final long
        vkCmdSetDepthBias2EXT;

    /** Function pointers for EXT_descriptor_buffer */
    public final long
        vkGetDescriptorSetLayoutSizeEXT,
        vkGetDescriptorSetLayoutBindingOffsetEXT,
        vkGetDescriptorEXT,
        vkCmdBindDescriptorBuffersEXT,
        vkCmdSetDescriptorBufferOffsetsEXT,
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT,
        vkGetBufferOpaqueCaptureDescriptorDataEXT,
        vkGetImageOpaqueCaptureDescriptorDataEXT,
        vkGetImageViewOpaqueCaptureDescriptorDataEXT,
        vkGetSamplerOpaqueCaptureDescriptorDataEXT,
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;

    /** Function pointers for EXT_device_fault */
    public final long
        vkGetDeviceFaultInfoEXT;

    /** Function pointers for EXT_discard_rectangles */
    public final long
        vkCmdSetDiscardRectangleEXT,
        vkCmdSetDiscardRectangleEnableEXT,
        vkCmdSetDiscardRectangleModeEXT;

    /** Function pointers for EXT_display_control */
    public final long
        vkDisplayPowerControlEXT,
        vkRegisterDeviceEventEXT,
        vkRegisterDisplayEventEXT,
        vkGetSwapchainCounterEXT;

    /** Function pointers for EXT_extended_dynamic_state */
    public final long
        vkCmdSetCullModeEXT,
        vkCmdSetFrontFaceEXT,
        vkCmdSetPrimitiveTopologyEXT,
        vkCmdSetViewportWithCountEXT,
        vkCmdSetScissorWithCountEXT,
        vkCmdBindVertexBuffers2EXT,
        vkCmdSetDepthTestEnableEXT,
        vkCmdSetDepthWriteEnableEXT,
        vkCmdSetDepthCompareOpEXT,
        vkCmdSetDepthBoundsTestEnableEXT,
        vkCmdSetStencilTestEnableEXT,
        vkCmdSetStencilOpEXT;

    /** Function pointers for EXT_extended_dynamic_state2 */
    public final long
        vkCmdSetPatchControlPointsEXT,
        vkCmdSetRasterizerDiscardEnableEXT,
        vkCmdSetDepthBiasEnableEXT,
        vkCmdSetLogicOpEXT,
        vkCmdSetPrimitiveRestartEnableEXT;

    /** Function pointers for EXT_extended_dynamic_state3 */
    public final long
        vkCmdSetDepthClampEnableEXT,
        vkCmdSetPolygonModeEXT,
        vkCmdSetRasterizationSamplesEXT,
        vkCmdSetSampleMaskEXT,
        vkCmdSetAlphaToCoverageEnableEXT,
        vkCmdSetAlphaToOneEnableEXT,
        vkCmdSetLogicOpEnableEXT,
        vkCmdSetColorBlendEnableEXT,
        vkCmdSetColorBlendEquationEXT,
        vkCmdSetColorWriteMaskEXT,
        vkCmdSetTessellationDomainOriginEXT,
        vkCmdSetRasterizationStreamEXT,
        vkCmdSetConservativeRasterizationModeEXT,
        vkCmdSetExtraPrimitiveOverestimationSizeEXT,
        vkCmdSetDepthClipEnableEXT,
        vkCmdSetSampleLocationsEnableEXT,
        vkCmdSetColorBlendAdvancedEXT,
        vkCmdSetProvokingVertexModeEXT,
        vkCmdSetLineRasterizationModeEXT,
        vkCmdSetLineStippleEnableEXT,
        vkCmdSetDepthClipNegativeOneToOneEXT,
        vkCmdSetViewportWScalingEnableNV,
        vkCmdSetViewportSwizzleNV,
        vkCmdSetCoverageToColorEnableNV,
        vkCmdSetCoverageToColorLocationNV,
        vkCmdSetCoverageModulationModeNV,
        vkCmdSetCoverageModulationTableEnableNV,
        vkCmdSetCoverageModulationTableNV,
        vkCmdSetShadingRateImageEnableNV,
        vkCmdSetRepresentativeFragmentTestEnableNV,
        vkCmdSetCoverageReductionModeNV;

    /** Function pointers for EXT_external_memory_host */
    public final long
        vkGetMemoryHostPointerPropertiesEXT;

    /** Function pointers for EXT_full_screen_exclusive */
    public final long
        vkAcquireFullScreenExclusiveModeEXT,
        vkReleaseFullScreenExclusiveModeEXT,
        vkGetDeviceGroupSurfacePresentModes2EXT;

    /** Function pointers for EXT_hdr_metadata */
    public final long
        vkSetHdrMetadataEXT;

    /** Function pointers for EXT_host_image_copy */
    public final long
        vkCopyMemoryToImageEXT,
        vkCopyImageToMemoryEXT,
        vkCopyImageToImageEXT,
        vkTransitionImageLayoutEXT,
        vkGetImageSubresourceLayout2EXT;

    /** Function pointers for EXT_host_query_reset */
    public final long
        vkResetQueryPoolEXT;

    /** Function pointers for EXT_image_drm_format_modifier */
    public final long
        vkGetImageDrmFormatModifierPropertiesEXT;

    /** Function pointers for EXT_line_rasterization */
    public final long
        vkCmdSetLineStippleEXT;

    /** Function pointers for EXT_mesh_shader */
    public final long
        vkCmdDrawMeshTasksEXT,
        vkCmdDrawMeshTasksIndirectEXT,
        vkCmdDrawMeshTasksIndirectCountEXT;

    /** Function pointers for EXT_metal_objects */
    public final long
        vkExportMetalObjectsEXT;

    /** Function pointers for EXT_multi_draw */
    public final long
        vkCmdDrawMultiEXT,
        vkCmdDrawMultiIndexedEXT;

    /** Function pointers for EXT_opacity_micromap */
    public final long
        vkCreateMicromapEXT,
        vkDestroyMicromapEXT,
        vkCmdBuildMicromapsEXT,
        vkBuildMicromapsEXT,
        vkCopyMicromapEXT,
        vkCopyMicromapToMemoryEXT,
        vkCopyMemoryToMicromapEXT,
        vkWriteMicromapsPropertiesEXT,
        vkCmdCopyMicromapEXT,
        vkCmdCopyMicromapToMemoryEXT,
        vkCmdCopyMemoryToMicromapEXT,
        vkCmdWriteMicromapsPropertiesEXT,
        vkGetDeviceMicromapCompatibilityEXT,
        vkGetMicromapBuildSizesEXT;

    /** Function pointers for EXT_pageable_device_local_memory */
    public final long
        vkSetDeviceMemoryPriorityEXT;

    /** Function pointers for EXT_pipeline_properties */
    public final long
        vkGetPipelinePropertiesEXT;

    /** Function pointers for EXT_private_data */
    public final long
        vkCreatePrivateDataSlotEXT,
        vkDestroyPrivateDataSlotEXT,
        vkSetPrivateDataEXT,
        vkGetPrivateDataEXT;

    /** Function pointers for EXT_sample_locations */
    public final long
        vkCmdSetSampleLocationsEXT;

    /** Function pointers for EXT_shader_module_identifier */
    public final long
        vkGetShaderModuleIdentifierEXT,
        vkGetShaderModuleCreateInfoIdentifierEXT;

    /** Function pointers for EXT_shader_object */
    public final long
        vkCreateShadersEXT,
        vkDestroyShaderEXT,
        vkGetShaderBinaryDataEXT,
        vkCmdBindShadersEXT,
        vkCmdSetVertexInputEXT;

    /** Function pointers for EXT_swapchain_maintenance1 */
    public final long
        vkReleaseSwapchainImagesEXT;

    /** Function pointers for EXT_transform_feedback */
    public final long
        vkCmdBindTransformFeedbackBuffersEXT,
        vkCmdBeginTransformFeedbackEXT,
        vkCmdEndTransformFeedbackEXT,
        vkCmdBeginQueryIndexedEXT,
        vkCmdEndQueryIndexedEXT,
        vkCmdDrawIndirectByteCountEXT;

    /** Function pointers for EXT_validation_cache */
    public final long
        vkCreateValidationCacheEXT,
        vkDestroyValidationCacheEXT,
        vkMergeValidationCachesEXT,
        vkGetValidationCacheDataEXT;

    /** Function pointers for GOOGLE_display_timing */
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

    /** Function pointers for HUAWEI_cluster_culling_shader */
    public final long
        vkCmdDrawClusterHUAWEI,
        vkCmdDrawClusterIndirectHUAWEI;

    /** Function pointers for HUAWEI_invocation_mask */
    public final long
        vkCmdBindInvocationMaskHUAWEI;

    /** Function pointers for HUAWEI_subpass_shading */
    public final long
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI,
        vkCmdSubpassShadingHUAWEI;

    /** Function pointers for INTEL_performance_query */
    public final long
        vkInitializePerformanceApiINTEL,
        vkUninitializePerformanceApiINTEL,
        vkCmdSetPerformanceMarkerINTEL,
        vkCmdSetPerformanceStreamMarkerINTEL,
        vkCmdSetPerformanceOverrideINTEL,
        vkAcquirePerformanceConfigurationINTEL,
        vkReleasePerformanceConfigurationINTEL,
        vkQueueSetPerformanceConfigurationINTEL,
        vkGetPerformanceParameterINTEL;

    /** Function pointers for KHR_acceleration_structure */
    public final long
        vkCreateAccelerationStructureKHR,
        vkDestroyAccelerationStructureKHR,
        vkCmdBuildAccelerationStructuresKHR,
        vkCmdBuildAccelerationStructuresIndirectKHR,
        vkBuildAccelerationStructuresKHR,
        vkCopyAccelerationStructureKHR,
        vkCopyAccelerationStructureToMemoryKHR,
        vkCopyMemoryToAccelerationStructureKHR,
        vkWriteAccelerationStructuresPropertiesKHR,
        vkCmdCopyAccelerationStructureKHR,
        vkCmdCopyAccelerationStructureToMemoryKHR,
        vkCmdCopyMemoryToAccelerationStructureKHR,
        vkGetAccelerationStructureDeviceAddressKHR,
        vkCmdWriteAccelerationStructuresPropertiesKHR,
        vkGetDeviceAccelerationStructureCompatibilityKHR,
        vkGetAccelerationStructureBuildSizesKHR;

    /** Function pointers for KHR_bind_memory2 */
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    /** Function pointers for KHR_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressKHR,
        vkGetBufferOpaqueCaptureAddressKHR,
        vkGetDeviceMemoryOpaqueCaptureAddressKHR;

    /** Function pointers for KHR_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsKHR;

    /** Function pointers for KHR_copy_commands2 */
    public final long
        vkCmdCopyBuffer2KHR,
        vkCmdCopyImage2KHR,
        vkCmdCopyBufferToImage2KHR,
        vkCmdCopyImageToBuffer2KHR,
        vkCmdBlitImage2KHR,
        vkCmdResolveImage2KHR;

    /** Function pointers for KHR_create_renderpass2 */
    public final long
        vkCreateRenderPass2KHR,
        vkCmdBeginRenderPass2KHR,
        vkCmdNextSubpass2KHR,
        vkCmdEndRenderPass2KHR;

    /** Function pointers for KHR_deferred_host_operations */
    public final long
        vkCreateDeferredOperationKHR,
        vkDestroyDeferredOperationKHR,
        vkGetDeferredOperationMaxConcurrencyKHR,
        vkGetDeferredOperationResultKHR,
        vkDeferredOperationJoinKHR;

    /** Function pointers for KHR_descriptor_update_template */
    public final long
        vkCreateDescriptorUpdateTemplateKHR,
        vkDestroyDescriptorUpdateTemplateKHR,
        vkUpdateDescriptorSetWithTemplateKHR,
        vkCmdPushDescriptorSetWithTemplateKHR;

    /** Function pointers for KHR_device_group */
    public final long
        vkGetDeviceGroupPeerMemoryFeaturesKHR,
        vkCmdSetDeviceMaskKHR,
        vkCmdDispatchBaseKHR,
        vkGetDeviceGroupPresentCapabilitiesKHR,
        vkGetDeviceGroupSurfacePresentModesKHR,
        vkAcquireNextImage2KHR;

    /** Function pointers for KHR_display_swapchain */
    public final long
        vkCreateSharedSwapchainsKHR;

    /** Function pointers for KHR_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountKHR,
        vkCmdDrawIndexedIndirectCountKHR;

    /** Function pointers for KHR_dynamic_rendering */
    public final long
        vkCmdBeginRenderingKHR,
        vkCmdEndRenderingKHR;

    /** Function pointers for KHR_dynamic_rendering_local_read */
    public final long
        vkCmdSetRenderingAttachmentLocationsKHR,
        vkCmdSetRenderingInputAttachmentIndicesKHR;

    /** Function pointers for KHR_external_fence_fd */
    public final long
        vkImportFenceFdKHR,
        vkGetFenceFdKHR;

    /** Function pointers for KHR_external_fence_win32 */
    public final long
        vkImportFenceWin32HandleKHR,
        vkGetFenceWin32HandleKHR;

    /** Function pointers for KHR_external_memory_fd */
    public final long
        vkGetMemoryFdKHR,
        vkGetMemoryFdPropertiesKHR;

    /** Function pointers for KHR_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleKHR,
        vkGetMemoryWin32HandlePropertiesKHR;

    /** Function pointers for KHR_external_semaphore_fd */
    public final long
        vkImportSemaphoreFdKHR,
        vkGetSemaphoreFdKHR;

    /** Function pointers for KHR_external_semaphore_win32 */
    public final long
        vkImportSemaphoreWin32HandleKHR,
        vkGetSemaphoreWin32HandleKHR;

    /** Function pointers for KHR_fragment_shading_rate */
    public final long
        vkCmdSetFragmentShadingRateKHR;

    /** Function pointers for KHR_get_memory_requirements2 */
    public final long
        vkGetImageMemoryRequirements2KHR,
        vkGetBufferMemoryRequirements2KHR,
        vkGetImageSparseMemoryRequirements2KHR;

    /** Function pointers for KHR_line_rasterization */
    public final long
        vkCmdSetLineStippleKHR;

    /** Function pointers for KHR_maintenance1 */
    public final long
        vkTrimCommandPoolKHR;

    /** Function pointers for KHR_maintenance3 */
    public final long
        vkGetDescriptorSetLayoutSupportKHR;

    /** Function pointers for KHR_maintenance4 */
    public final long
        vkGetDeviceBufferMemoryRequirementsKHR,
        vkGetDeviceImageMemoryRequirementsKHR,
        vkGetDeviceImageSparseMemoryRequirementsKHR;

    /** Function pointers for KHR_maintenance5 */
    public final long
        vkCmdBindIndexBuffer2KHR,
        vkGetRenderingAreaGranularityKHR,
        vkGetDeviceImageSubresourceLayoutKHR,
        vkGetImageSubresourceLayout2KHR;

    /** Function pointers for KHR_maintenance6 */
    public final long
        vkCmdBindDescriptorSets2KHR,
        vkCmdPushConstants2KHR,
        vkCmdPushDescriptorSet2KHR,
        vkCmdPushDescriptorSetWithTemplate2KHR,
        vkCmdSetDescriptorBufferOffsets2EXT,
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;

    /** Function pointers for KHR_map_memory2 */
    public final long
        vkMapMemory2KHR,
        vkUnmapMemory2KHR;

    /** Function pointers for KHR_performance_query */
    public final long
        vkAcquireProfilingLockKHR,
        vkReleaseProfilingLockKHR;

    /** Function pointers for KHR_pipeline_binary */
    public final long
        vkCreatePipelineBinariesKHR,
        vkDestroyPipelineBinaryKHR,
        vkGetPipelineKeyKHR,
        vkGetPipelineBinaryDataKHR,
        vkReleaseCapturedPipelineDataKHR;

    /** Function pointers for KHR_pipeline_executable_properties */
    public final long
        vkGetPipelineExecutablePropertiesKHR,
        vkGetPipelineExecutableStatisticsKHR,
        vkGetPipelineExecutableInternalRepresentationsKHR;

    /** Function pointers for KHR_present_wait */
    public final long
        vkWaitForPresentKHR;

    /** Function pointers for KHR_push_descriptor */
    public final long
        vkCmdPushDescriptorSetKHR;

    /** Function pointers for KHR_ray_tracing_maintenance1 */
    public final long
        vkCmdTraceRaysIndirect2KHR;

    /** Function pointers for KHR_ray_tracing_pipeline */
    public final long
        vkCmdTraceRaysKHR,
        vkCreateRayTracingPipelinesKHR,
        vkGetRayTracingShaderGroupHandlesKHR,
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR,
        vkCmdTraceRaysIndirectKHR,
        vkGetRayTracingShaderGroupStackSizeKHR,
        vkCmdSetRayTracingPipelineStackSizeKHR;

    /** Function pointers for KHR_sampler_ycbcr_conversion */
    public final long
        vkCreateSamplerYcbcrConversionKHR,
        vkDestroySamplerYcbcrConversionKHR;

    /** Function pointers for KHR_shared_presentable_image */
    public final long
        vkGetSwapchainStatusKHR;

    /** Function pointers for KHR_swapchain */
    public final long
        vkCreateSwapchainKHR,
        vkDestroySwapchainKHR,
        vkGetSwapchainImagesKHR,
        vkAcquireNextImageKHR,
        vkQueuePresentKHR;

    /** Function pointers for KHR_synchronization2 */
    public final long
        vkCmdSetEvent2KHR,
        vkCmdResetEvent2KHR,
        vkCmdWaitEvents2KHR,
        vkCmdPipelineBarrier2KHR,
        vkCmdWriteTimestamp2KHR,
        vkQueueSubmit2KHR,
        vkCmdWriteBufferMarker2AMD,
        vkGetQueueCheckpointData2NV;

    /** Function pointers for KHR_timeline_semaphore */
    public final long
        vkGetSemaphoreCounterValueKHR,
        vkWaitSemaphoresKHR,
        vkSignalSemaphoreKHR;

    /** Function pointers for KHR_video_decode_queue */
    public final long
        vkCmdDecodeVideoKHR;

    /** Function pointers for KHR_video_encode_queue */
    public final long
        vkGetEncodedVideoSessionParametersKHR,
        vkCmdEncodeVideoKHR;

    /** Function pointers for KHR_video_queue */
    public final long
        vkCreateVideoSessionKHR,
        vkDestroyVideoSessionKHR,
        vkGetVideoSessionMemoryRequirementsKHR,
        vkBindVideoSessionMemoryKHR,
        vkCreateVideoSessionParametersKHR,
        vkUpdateVideoSessionParametersKHR,
        vkDestroyVideoSessionParametersKHR,
        vkCmdBeginVideoCodingKHR,
        vkCmdEndVideoCodingKHR,
        vkCmdControlVideoCodingKHR;

    /** Function pointers for NV_clip_space_w_scaling */
    public final long
        vkCmdSetViewportWScalingNV;

    /** Function pointers for NV_copy_memory_indirect */
    public final long
        vkCmdCopyMemoryIndirectNV,
        vkCmdCopyMemoryToImageIndirectNV;

    /** Function pointers for NV_cuda_kernel_launch */
    public final long
        vkCreateCudaModuleNV,
        vkGetCudaModuleCacheNV,
        vkCreateCudaFunctionNV,
        vkDestroyCudaModuleNV,
        vkDestroyCudaFunctionNV,
        vkCmdCudaLaunchKernelNV;

    /** Function pointers for NV_device_diagnostic_checkpoints */
    public final long
        vkCmdSetCheckpointNV,
        vkGetQueueCheckpointDataNV;

    /** Function pointers for NV_device_generated_commands */
    public final long
        vkGetGeneratedCommandsMemoryRequirementsNV,
        vkCmdPreprocessGeneratedCommandsNV,
        vkCmdExecuteGeneratedCommandsNV,
        vkCmdBindPipelineShaderGroupNV,
        vkCreateIndirectCommandsLayoutNV,
        vkDestroyIndirectCommandsLayoutNV;

    /** Function pointers for NV_device_generated_commands_compute */
    public final long
        vkGetPipelineIndirectMemoryRequirementsNV,
        vkCmdUpdatePipelineIndirectBufferNV,
        vkGetPipelineIndirectDeviceAddressNV;

    /** Function pointers for NV_external_memory_rdma */
    public final long
        vkGetMemoryRemoteAddressNV;

    /** Function pointers for NV_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleNV;

    /** Function pointers for NV_fragment_shading_rate_enums */
    public final long
        vkCmdSetFragmentShadingRateEnumNV;

    /** Function pointers for NV_low_latency2 */
    public final long
        vkSetLatencySleepModeNV,
        vkLatencySleepNV,
        vkSetLatencyMarkerNV,
        vkGetLatencyTimingsNV,
        vkQueueNotifyOutOfBandNV;

    /** Function pointers for NV_memory_decompression */
    public final long
        vkCmdDecompressMemoryNV,
        vkCmdDecompressMemoryIndirectCountNV;

    /** Function pointers for NV_mesh_shader */
    public final long
        vkCmdDrawMeshTasksNV,
        vkCmdDrawMeshTasksIndirectNV,
        vkCmdDrawMeshTasksIndirectCountNV;

    /** Function pointers for NV_optical_flow */
    public final long
        vkCreateOpticalFlowSessionNV,
        vkDestroyOpticalFlowSessionNV,
        vkBindOpticalFlowSessionImageNV,
        vkCmdOpticalFlowExecuteNV;

    /** Function pointers for NV_ray_tracing */
    public final long
        vkCreateAccelerationStructureNV,
        vkDestroyAccelerationStructureNV,
        vkGetAccelerationStructureMemoryRequirementsNV,
        vkBindAccelerationStructureMemoryNV,
        vkCmdBuildAccelerationStructureNV,
        vkCmdCopyAccelerationStructureNV,
        vkCmdTraceRaysNV,
        vkCreateRayTracingPipelinesNV,
        vkGetRayTracingShaderGroupHandlesNV,
        vkGetAccelerationStructureHandleNV,
        vkCmdWriteAccelerationStructuresPropertiesNV,
        vkCompileDeferredNV;

    /** Function pointers for NV_scissor_exclusive */
    public final long
        vkCmdSetExclusiveScissorEnableNV,
        vkCmdSetExclusiveScissorNV;

    /** Function pointers for NV_shading_rate_image */
    public final long
        vkCmdBindShadingRateImageNV,
        vkCmdSetViewportShadingRatePaletteNV,
        vkCmdSetCoarseSampleOrderNV;

    /** Function pointers for NVX_binary_import */
    public final long
        vkCreateCuModuleNVX,
        vkCreateCuFunctionNVX,
        vkDestroyCuModuleNVX,
        vkDestroyCuFunctionNVX,
        vkCmdCuLaunchKernelNVX;

    /** Function pointers for NVX_image_view_handle */
    public final long
        vkGetImageViewHandleNVX,
        vkGetImageViewAddressNVX;

    /** Function pointers for QCOM_tile_properties */
    public final long
        vkGetFramebufferTilePropertiesQCOM,
        vkGetDynamicRenderingTilePropertiesQCOM;

    /** Function pointers for VALVE_descriptor_set_host_mapping */
    public final long
        vkGetDescriptorSetLayoutHostMappingInfoVALVE,
        vkGetDescriptorSetHostMappingVALVE;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@link VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@link VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@link VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@link VK13} is supported. */
    public final boolean Vulkan13;
    /** When true, {@link AMDAntiLag} is supported. */
    public final boolean VK_AMD_anti_lag;
    /** When true, {@link AMDBufferMarker} is supported. */
    public final boolean VK_AMD_buffer_marker;
    /** When true, {@link AMDDeviceCoherentMemory} is supported. */
    public final boolean VK_AMD_device_coherent_memory;
    /** When true, {@link AMDDisplayNativeHdr} is supported. */
    public final boolean VK_AMD_display_native_hdr;
    /** When true, {@link AMDDrawIndirectCount} is supported. */
    public final boolean VK_AMD_draw_indirect_count;
    /** When true, {@link AMDGCNShader} is supported. */
    public final boolean VK_AMD_gcn_shader;
    /** When true, {@link AMDGPUShaderHalfFloat} is supported. */
    public final boolean VK_AMD_gpu_shader_half_float;
    /** When true, {@link AMDGPUShaderInt16} is supported. */
    public final boolean VK_AMD_gpu_shader_int16;
    /** When true, {@link AMDMemoryOverallocationBehavior} is supported. */
    public final boolean VK_AMD_memory_overallocation_behavior;
    /** When true, {@link AMDMixedAttachmentSamples} is supported. */
    public final boolean VK_AMD_mixed_attachment_samples;
    /** When true, {@link AMDNegativeViewportHeight} is supported. */
    public final boolean VK_AMD_negative_viewport_height;
    /** When true, {@link AMDPipelineCompilerControl} is supported. */
    public final boolean VK_AMD_pipeline_compiler_control;
    /** When true, {@link AMDRasterizationOrder} is supported. */
    public final boolean VK_AMD_rasterization_order;
    /** When true, {@link AMDShaderBallot} is supported. */
    public final boolean VK_AMD_shader_ballot;
    /** When true, {@link AMDShaderCoreProperties} is supported. */
    public final boolean VK_AMD_shader_core_properties;
    /** When true, {@link AMDShaderCoreProperties2} is supported. */
    public final boolean VK_AMD_shader_core_properties2;
    /** When true, {@link AMDShaderEarlyAndLateFragmentTests} is supported. */
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
    /** When true, {@link AMDShaderExplicitVertexParameter} is supported. */
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    /** When true, {@link AMDShaderFragmentMask} is supported. */
    public final boolean VK_AMD_shader_fragment_mask;
    /** When true, {@link AMDShaderImageLoadStoreLod} is supported. */
    public final boolean VK_AMD_shader_image_load_store_lod;
    /** When true, {@link AMDShaderInfo} is supported. */
    public final boolean VK_AMD_shader_info;
    /** When true, {@link AMDShaderTrinaryMinmax} is supported. */
    public final boolean VK_AMD_shader_trinary_minmax;
    /** When true, {@link AMDTextureGatherBiasLod} is supported. */
    public final boolean VK_AMD_texture_gather_bias_lod;
    /** When true, {@link AMDXShaderEnqueue} is supported. */
    public final boolean VK_AMDX_shader_enqueue;
    /** When true, {@link ANDROIDExternalFormatResolve} is supported. */
    public final boolean VK_ANDROID_external_format_resolve;
    /** When true, {@link ANDROIDExternalMemoryAndroidHardwareBuffer} is supported. */
    public final boolean VK_ANDROID_external_memory_android_hardware_buffer;
    /** When true, {@link ARMRasterizationOrderAttachmentAccess} is supported. */
    public final boolean VK_ARM_rasterization_order_attachment_access;
    /** When true, {@link ARMRenderPassStriped} is supported. */
    public final boolean VK_ARM_render_pass_striped;
    /** When true, {@link ARMSchedulingControls} is supported. */
    public final boolean VK_ARM_scheduling_controls;
    /** When true, {@link ARMShaderCoreBuiltins} is supported. */
    public final boolean VK_ARM_shader_core_builtins;
    /** When true, {@link ARMShaderCoreProperties} is supported. */
    public final boolean VK_ARM_shader_core_properties;
    /** When true, {@link EXT4444Formats} is supported. */
    public final boolean VK_EXT_4444_formats;
    /** When true, {@link EXTAstcDecodeMode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@link EXTAttachmentFeedbackLoopDynamicState} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_dynamic_state;
    /** When true, {@link EXTAttachmentFeedbackLoopLayout} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    /** When true, {@link EXTBlendOperationAdvanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@link EXTBorderColorSwizzle} is supported. */
    public final boolean VK_EXT_border_color_swizzle;
    /** When true, {@link EXTBufferDeviceAddress} is supported. */
    public final boolean VK_EXT_buffer_device_address;
    /** When true, {@link EXTCalibratedTimestamps} is supported. */
    public final boolean VK_EXT_calibrated_timestamps;
    /** When true, {@link EXTColorWriteEnable} is supported. */
    public final boolean VK_EXT_color_write_enable;
    /** When true, {@link EXTConditionalRendering} is supported. */
    public final boolean VK_EXT_conditional_rendering;
    /** When true, {@link EXTConservativeRasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@link EXTCustomBorderColor} is supported. */
    public final boolean VK_EXT_custom_border_color;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@link EXTDepthBiasControl} is supported. */
    public final boolean VK_EXT_depth_bias_control;
    /** When true, {@link EXTDepthClampZeroOne} is supported. */
    public final boolean VK_EXT_depth_clamp_zero_one;
    /** When true, {@link EXTDepthClipControl} is supported. */
    public final boolean VK_EXT_depth_clip_control;
    /** When true, {@link EXTDepthClipEnable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@link EXTDepthRangeUnrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@link EXTDescriptorBuffer} is supported. */
    public final boolean VK_EXT_descriptor_buffer;
    /** When true, {@link EXTDescriptorIndexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@link EXTDeviceAddressBindingReport} is supported. */
    public final boolean VK_EXT_device_address_binding_report;
    /** When true, {@link EXTDeviceFault} is supported. */
    public final boolean VK_EXT_device_fault;
    /** When true, {@link EXTDeviceMemoryReport} is supported. */
    public final boolean VK_EXT_device_memory_report;
    /** When true, {@link EXTDiscardRectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@link EXTDisplayControl} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@link EXTDynamicRenderingUnusedAttachments} is supported. */
    public final boolean VK_EXT_dynamic_rendering_unused_attachments;
    /** When true, {@link EXTExtendedDynamicState} is supported. */
    public final boolean VK_EXT_extended_dynamic_state;
    /** When true, {@link EXTExtendedDynamicState2} is supported. */
    public final boolean VK_EXT_extended_dynamic_state2;
    /** When true, {@link EXTExtendedDynamicState3} is supported. */
    public final boolean VK_EXT_extended_dynamic_state3;
    /** When true, {@link EXTExternalMemoryAcquireUnmodified} is supported. */
    public final boolean VK_EXT_external_memory_acquire_unmodified;
    /** When true, {@link EXTExternalMemoryDmaBuf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@link EXTExternalMemoryHost} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@link EXTFilterCubic} is supported. */
    public final boolean VK_EXT_filter_cubic;
    /** When true, {@link EXTFragmentDensityMap} is supported. */
    public final boolean VK_EXT_fragment_density_map;
    /** When true, {@link EXTFragmentDensityMap2} is supported. */
    public final boolean VK_EXT_fragment_density_map2;
    /** When true, {@link EXTFragmentShaderInterlock} is supported. */
    public final boolean VK_EXT_fragment_shader_interlock;
    /** When true, {@link EXTFrameBoundary} is supported. */
    public final boolean VK_EXT_frame_boundary;
    /** When true, {@link EXTFullScreenExclusive} is supported. */
    public final boolean VK_EXT_full_screen_exclusive;
    /** When true, {@link EXTGlobalPriority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@link EXTGlobalPriorityQuery} is supported. */
    public final boolean VK_EXT_global_priority_query;
    /** When true, {@link EXTGraphicsPipelineLibrary} is supported. */
    public final boolean VK_EXT_graphics_pipeline_library;
    /** When true, {@link EXTHdrMetadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@link EXTHostImageCopy} is supported. */
    public final boolean VK_EXT_host_image_copy;
    /** When true, {@link EXTHostQueryReset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@link EXTImage2dViewOf3d} is supported. */
    public final boolean VK_EXT_image_2d_view_of_3d;
    /** When true, {@link EXTImageCompressionControl} is supported. */
    public final boolean VK_EXT_image_compression_control;
    /** When true, {@link EXTImageCompressionControlSwapchain} is supported. */
    public final boolean VK_EXT_image_compression_control_swapchain;
    /** When true, {@link EXTImageDrmFormatModifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@link EXTImageRobustness} is supported. */
    public final boolean VK_EXT_image_robustness;
    /** When true, {@link EXTImageSlicedViewOf3d} is supported. */
    public final boolean VK_EXT_image_sliced_view_of_3d;
    /** When true, {@link EXTImageViewMinLod} is supported. */
    public final boolean VK_EXT_image_view_min_lod;
    /** When true, {@link EXTIndexTypeUint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@link EXTInlineUniformBlock} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@link EXTLegacyDithering} is supported. */
    public final boolean VK_EXT_legacy_dithering;
    /** When true, {@link EXTLegacyVertexAttributes} is supported. */
    public final boolean VK_EXT_legacy_vertex_attributes;
    /** When true, {@link EXTLineRasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@link EXTLoadStoreOpNone} is supported. */
    public final boolean VK_EXT_load_store_op_none;
    /** When true, {@link EXTMapMemoryPlaced} is supported. */
    public final boolean VK_EXT_map_memory_placed;
    /** When true, {@link EXTMemoryBudget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@link EXTMemoryPriority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@link EXTMeshShader} is supported. */
    public final boolean VK_EXT_mesh_shader;
    /** When true, {@link EXTMetalObjects} is supported. */
    public final boolean VK_EXT_metal_objects;
    /** When true, {@link EXTMultiDraw} is supported. */
    public final boolean VK_EXT_multi_draw;
    /** When true, {@link EXTMultisampledRenderToSingleSampled} is supported. */
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    /** When true, {@link EXTMutableDescriptorType} is supported. */
    public final boolean VK_EXT_mutable_descriptor_type;
    /** When true, {@link EXTNestedCommandBuffer} is supported. */
    public final boolean VK_EXT_nested_command_buffer;
    /** When true, {@link EXTNonSeamlessCubeMap} is supported. */
    public final boolean VK_EXT_non_seamless_cube_map;
    /** When true, {@link EXTOpacityMicromap} is supported. */
    public final boolean VK_EXT_opacity_micromap;
    /** When true, {@link EXTPageableDeviceLocalMemory} is supported. */
    public final boolean VK_EXT_pageable_device_local_memory;
    /** When true, {@link EXTPciBusInfo} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@link EXTPhysicalDeviceDrm} is supported. */
    public final boolean VK_EXT_physical_device_drm;
    /** When true, {@link EXTPipelineCreationCacheControl} is supported. */
    public final boolean VK_EXT_pipeline_creation_cache_control;
    /** When true, {@link EXTPipelineCreationFeedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@link EXTPipelineLibraryGroupHandles} is supported. */
    public final boolean VK_EXT_pipeline_library_group_handles;
    /** When true, {@link EXTPipelineProperties} is supported. */
    public final boolean VK_EXT_pipeline_properties;
    /** When true, {@link EXTPipelineProtectedAccess} is supported. */
    public final boolean VK_EXT_pipeline_protected_access;
    /** When true, {@link EXTPipelineRobustness} is supported. */
    public final boolean VK_EXT_pipeline_robustness;
    /** When true, {@link EXTPostDepthCoverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@link EXTPrimitiveTopologyListRestart} is supported. */
    public final boolean VK_EXT_primitive_topology_list_restart;
    /** When true, {@link EXTPrimitivesGeneratedQuery} is supported. */
    public final boolean VK_EXT_primitives_generated_query;
    /** When true, {@link EXTPrivateData} is supported. */
    public final boolean VK_EXT_private_data;
    /** When true, {@link EXTProvokingVertex} is supported. */
    public final boolean VK_EXT_provoking_vertex;
    /** When true, {@link EXTQueueFamilyForeign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@link EXTRasterizationOrderAttachmentAccess} is supported. */
    public final boolean VK_EXT_rasterization_order_attachment_access;
    /** When true, {@link EXTRgba10x6Formats} is supported. */
    public final boolean VK_EXT_rgba10x6_formats;
    /** When true, {@link EXTRobustness2} is supported. */
    public final boolean VK_EXT_robustness2;
    /** When true, {@link EXTSampleLocations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@link EXTSamplerFilterMinmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@link EXTScalarBlockLayout} is supported. */
    public final boolean VK_EXT_scalar_block_layout;
    /** When true, {@link EXTSeparateStencilUsage} is supported. */
    public final boolean VK_EXT_separate_stencil_usage;
    /** When true, {@link EXTShaderAtomicFloat} is supported. */
    public final boolean VK_EXT_shader_atomic_float;
    /** When true, {@link EXTShaderAtomicFloat2} is supported. */
    public final boolean VK_EXT_shader_atomic_float2;
    /** When true, {@link EXTShaderDemoteToHelperInvocation} is supported. */
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    /** When true, {@link EXTShaderImageAtomicInt64} is supported. */
    public final boolean VK_EXT_shader_image_atomic_int64;
    /** When true, {@link EXTShaderModuleIdentifier} is supported. */
    public final boolean VK_EXT_shader_module_identifier;
    /** When true, {@link EXTShaderObject} is supported. */
    public final boolean VK_EXT_shader_object;
    /** When true, {@link EXTShaderReplicatedComposites} is supported. */
    public final boolean VK_EXT_shader_replicated_composites;
    /** When true, {@link EXTShaderStencilExport} is supported. */
    public final boolean VK_EXT_shader_stencil_export;
    /** When true, {@link EXTShaderSubgroupBallot} is supported. */
    public final boolean VK_EXT_shader_subgroup_ballot;
    /** When true, {@link EXTShaderSubgroupVote} is supported. */
    public final boolean VK_EXT_shader_subgroup_vote;
    /** When true, {@link EXTShaderTileImage} is supported. */
    public final boolean VK_EXT_shader_tile_image;
    /** When true, {@link EXTShaderViewportIndexLayer} is supported. */
    public final boolean VK_EXT_shader_viewport_index_layer;
    /** When true, {@link EXTSubgroupSizeControl} is supported. */
    public final boolean VK_EXT_subgroup_size_control;
    /** When true, {@link EXTSubpassMergeFeedback} is supported. */
    public final boolean VK_EXT_subpass_merge_feedback;
    /** When true, {@link EXTSwapchainMaintenance1} is supported. */
    public final boolean VK_EXT_swapchain_maintenance1;
    /** When true, {@link EXTTexelBufferAlignment} is supported. */
    public final boolean VK_EXT_texel_buffer_alignment;
    /** When true, {@link EXTTextureCompressionAstcHdr} is supported. */
    public final boolean VK_EXT_texture_compression_astc_hdr;
    /** When true, {@link EXTToolingInfo} is supported. */
    public final boolean VK_EXT_tooling_info;
    /** When true, {@link EXTTransformFeedback} is supported. */
    public final boolean VK_EXT_transform_feedback;
    /** When true, {@link EXTValidationCache} is supported. */
    public final boolean VK_EXT_validation_cache;
    /** When true, {@link EXTVertexAttributeDivisor} is supported. */
    public final boolean VK_EXT_vertex_attribute_divisor;
    /** When true, {@link EXTVertexInputDynamicState} is supported. */
    public final boolean VK_EXT_vertex_input_dynamic_state;
    /** When true, {@link EXTYcbcr2plane444Formats} is supported. */
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    /** When true, {@link EXTYcbcrImageArrays} is supported. */
    public final boolean VK_EXT_ycbcr_image_arrays;
    /** When true, {@link GOOGLEDecorateString} is supported. */
    public final boolean VK_GOOGLE_decorate_string;
    /** When true, {@link GOOGLEDisplayTiming} is supported. */
    public final boolean VK_GOOGLE_display_timing;
    /** When true, {@link GOOGLEHlslFunctionality1} is supported. */
    public final boolean VK_GOOGLE_hlsl_functionality1;
    /** When true, {@link GOOGLEUserType} is supported. */
    public final boolean VK_GOOGLE_user_type;
    /** When true, {@link HUAWEIClusterCullingShader} is supported. */
    public final boolean VK_HUAWEI_cluster_culling_shader;
    /** When true, {@link HUAWEIInvocationMask} is supported. */
    public final boolean VK_HUAWEI_invocation_mask;
    /** When true, {@link HUAWEISubpassShading} is supported. */
    public final boolean VK_HUAWEI_subpass_shading;
    /** When true, {@link IMGFilterCubic} is supported. */
    public final boolean VK_IMG_filter_cubic;
    /** When true, {@link IMGFormatPVRTC} is supported. */
    public final boolean VK_IMG_format_pvrtc;
    /** When true, {@link IMGRelaxedLineRasterization} is supported. */
    public final boolean VK_IMG_relaxed_line_rasterization;
    /** When true, {@link INTELPerformanceQuery} is supported. */
    public final boolean VK_INTEL_performance_query;
    /** When true, {@link INTELShaderIntegerFunctions2} is supported. */
    public final boolean VK_INTEL_shader_integer_functions2;
    /** When true, {@link KHR16bitStorage} is supported. */
    public final boolean VK_KHR_16bit_storage;
    /** When true, {@link KHR8bitStorage} is supported. */
    public final boolean VK_KHR_8bit_storage;
    /** When true, {@link KHRAccelerationStructure} is supported. */
    public final boolean VK_KHR_acceleration_structure;
    /** When true, {@link KHRBindMemory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@link KHRBufferDeviceAddress} is supported. */
    public final boolean VK_KHR_buffer_device_address;
    /** When true, {@link KHRCalibratedTimestamps} is supported. */
    public final boolean VK_KHR_calibrated_timestamps;
    /** When true, {@link KHRComputeShaderDerivatives} is supported. */
    public final boolean VK_KHR_compute_shader_derivatives;
    /** When true, {@link KHRCooperativeMatrix} is supported. */
    public final boolean VK_KHR_cooperative_matrix;
    /** When true, {@link KHRCopyCommands2} is supported. */
    public final boolean VK_KHR_copy_commands2;
    /** When true, {@link KHRCreateRenderpass2} is supported. */
    public final boolean VK_KHR_create_renderpass2;
    /** When true, {@link KHRDedicatedAllocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
    /** When true, {@link KHRDeferredHostOperations} is supported. */
    public final boolean VK_KHR_deferred_host_operations;
    /** When true, {@link KHRDepthStencilResolve} is supported. */
    public final boolean VK_KHR_depth_stencil_resolve;
    /** When true, {@link KHRDescriptorUpdateTemplate} is supported. */
    public final boolean VK_KHR_descriptor_update_template;
    /** When true, {@link KHRDeviceGroup} is supported. */
    public final boolean VK_KHR_device_group;
    /** When true, {@link KHRDisplaySwapchain} is supported. */
    public final boolean VK_KHR_display_swapchain;
    /** When true, {@link KHRDrawIndirectCount} is supported. */
    public final boolean VK_KHR_draw_indirect_count;
    /** When true, {@link KHRDriverProperties} is supported. */
    public final boolean VK_KHR_driver_properties;
    /** When true, {@link KHRDynamicRendering} is supported. */
    public final boolean VK_KHR_dynamic_rendering;
    /** When true, {@link KHRDynamicRenderingLocalRead} is supported. */
    public final boolean VK_KHR_dynamic_rendering_local_read;
    /** When true, {@link KHRExternalFence} is supported. */
    public final boolean VK_KHR_external_fence;
    /** When true, {@link KHRExternalFenceFd} is supported. */
    public final boolean VK_KHR_external_fence_fd;
    /** When true, {@link KHRExternalFenceWin32} is supported. */
    public final boolean VK_KHR_external_fence_win32;
    /** When true, {@link KHRExternalMemory} is supported. */
    public final boolean VK_KHR_external_memory;
    /** When true, {@link KHRExternalMemoryFd} is supported. */
    public final boolean VK_KHR_external_memory_fd;
    /** When true, {@link KHRExternalMemoryWin32} is supported. */
    public final boolean VK_KHR_external_memory_win32;
    /** When true, {@link KHRExternalSemaphore} is supported. */
    public final boolean VK_KHR_external_semaphore;
    /** When true, {@link KHRExternalSemaphoreFd} is supported. */
    public final boolean VK_KHR_external_semaphore_fd;
    /** When true, {@link KHRExternalSemaphoreWin32} is supported. */
    public final boolean VK_KHR_external_semaphore_win32;
    /** When true, {@link KHRFormatFeatureFlags2} is supported. */
    public final boolean VK_KHR_format_feature_flags2;
    /** When true, {@link KHRFragmentShaderBarycentric} is supported. */
    public final boolean VK_KHR_fragment_shader_barycentric;
    /** When true, {@link KHRFragmentShadingRate} is supported. */
    public final boolean VK_KHR_fragment_shading_rate;
    /** When true, {@link KHRGetMemoryRequirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@link KHRGlobalPriority} is supported. */
    public final boolean VK_KHR_global_priority;
    /** When true, {@link KHRImageFormatList} is supported. */
    public final boolean VK_KHR_image_format_list;
    /** When true, {@link KHRImagelessFramebuffer} is supported. */
    public final boolean VK_KHR_imageless_framebuffer;
    /** When true, {@link KHRIncrementalPresent} is supported. */
    public final boolean VK_KHR_incremental_present;
    /** When true, {@link KHRIndexTypeUint8} is supported. */
    public final boolean VK_KHR_index_type_uint8;
    /** When true, {@link KHRLineRasterization} is supported. */
    public final boolean VK_KHR_line_rasterization;
    /** When true, {@link KHRLoadStoreOpNone} is supported. */
    public final boolean VK_KHR_load_store_op_none;
    /** When true, {@link KHRMaintenance1} is supported. */
    public final boolean VK_KHR_maintenance1;
    /** When true, {@link KHRMaintenance2} is supported. */
    public final boolean VK_KHR_maintenance2;
    /** When true, {@link KHRMaintenance3} is supported. */
    public final boolean VK_KHR_maintenance3;
    /** When true, {@link KHRMaintenance4} is supported. */
    public final boolean VK_KHR_maintenance4;
    /** When true, {@link KHRMaintenance5} is supported. */
    public final boolean VK_KHR_maintenance5;
    /** When true, {@link KHRMaintenance6} is supported. */
    public final boolean VK_KHR_maintenance6;
    /** When true, {@link KHRMaintenance7} is supported. */
    public final boolean VK_KHR_maintenance7;
    /** When true, {@link KHRMapMemory2} is supported. */
    public final boolean VK_KHR_map_memory2;
    /** When true, {@link KHRMultiview} is supported. */
    public final boolean VK_KHR_multiview;
    /** When true, {@link KHRPerformanceQuery} is supported. */
    public final boolean VK_KHR_performance_query;
    /** When true, {@link KHRPipelineBinary} is supported. */
    public final boolean VK_KHR_pipeline_binary;
    /** When true, {@link KHRPipelineExecutableProperties} is supported. */
    public final boolean VK_KHR_pipeline_executable_properties;
    /** When true, {@link KHRPipelineLibrary} is supported. */
    public final boolean VK_KHR_pipeline_library;
    /** When true, {@link KHRPortabilitySubset} is supported. */
    public final boolean VK_KHR_portability_subset;
    /** When true, {@link KHRPresentId} is supported. */
    public final boolean VK_KHR_present_id;
    /** When true, {@link KHRPresentWait} is supported. */
    public final boolean VK_KHR_present_wait;
    /** When true, {@link KHRPushDescriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
    /** When true, {@link KHRRayQuery} is supported. */
    public final boolean VK_KHR_ray_query;
    /** When true, {@link KHRRayTracingMaintenance1} is supported. */
    public final boolean VK_KHR_ray_tracing_maintenance1;
    /** When true, {@link KHRRayTracingPipeline} is supported. */
    public final boolean VK_KHR_ray_tracing_pipeline;
    /** When true, {@link KHRRayTracingPositionFetch} is supported. */
    public final boolean VK_KHR_ray_tracing_position_fetch;
    /** When true, {@link KHRRelaxedBlockLayout} is supported. */
    public final boolean VK_KHR_relaxed_block_layout;
    /** When true, {@link KHRSamplerMirrorClampToEdge} is supported. */
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    /** When true, {@link KHRSamplerYcbcrConversion} is supported. */
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    /** When true, {@link KHRSeparateDepthStencilLayouts} is supported. */
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    /** When true, {@link KHRShaderAtomicInt64} is supported. */
    public final boolean VK_KHR_shader_atomic_int64;
    /** When true, {@link KHRShaderClock} is supported. */
    public final boolean VK_KHR_shader_clock;
    /** When true, {@link KHRShaderDrawParameters} is supported. */
    public final boolean VK_KHR_shader_draw_parameters;
    /** When true, {@link KHRShaderExpectAssume} is supported. */
    public final boolean VK_KHR_shader_expect_assume;
    /** When true, {@link KHRShaderFloat16Int8} is supported. */
    public final boolean VK_KHR_shader_float16_int8;
    /** When true, {@link KHRShaderFloatControls} is supported. */
    public final boolean VK_KHR_shader_float_controls;
    /** When true, {@link KHRShaderFloatControls2} is supported. */
    public final boolean VK_KHR_shader_float_controls2;
    /** When true, {@link KHRShaderIntegerDotProduct} is supported. */
    public final boolean VK_KHR_shader_integer_dot_product;
    /** When true, {@link KHRShaderMaximalReconvergence} is supported. */
    public final boolean VK_KHR_shader_maximal_reconvergence;
    /** When true, {@link KHRShaderNonSemanticInfo} is supported. */
    public final boolean VK_KHR_shader_non_semantic_info;
    /** When true, {@link KHRShaderQuadControl} is supported. */
    public final boolean VK_KHR_shader_quad_control;
    /** When true, {@link KHRShaderRelaxedExtendedInstruction} is supported. */
    public final boolean VK_KHR_shader_relaxed_extended_instruction;
    /** When true, {@link KHRShaderSubgroupExtendedTypes} is supported. */
    public final boolean VK_KHR_shader_subgroup_extended_types;
    /** When true, {@link KHRShaderSubgroupRotate} is supported. */
    public final boolean VK_KHR_shader_subgroup_rotate;
    /** When true, {@link KHRShaderSubgroupUniformControlFlow} is supported. */
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    /** When true, {@link KHRShaderTerminateInvocation} is supported. */
    public final boolean VK_KHR_shader_terminate_invocation;
    /** When true, {@link KHRSharedPresentableImage} is supported. */
    public final boolean VK_KHR_shared_presentable_image;
    /** When true, {@link KHRSpirv14} is supported. */
    public final boolean VK_KHR_spirv_1_4;
    /** When true, {@link KHRStorageBufferStorageClass} is supported. */
    public final boolean VK_KHR_storage_buffer_storage_class;
    /** When true, {@link KHRSwapchain} is supported. */
    public final boolean VK_KHR_swapchain;
    /** When true, {@link KHRSwapchainMutableFormat} is supported. */
    public final boolean VK_KHR_swapchain_mutable_format;
    /** When true, {@link KHRSynchronization2} is supported. */
    public final boolean VK_KHR_synchronization2;
    /** When true, {@link KHRTimelineSemaphore} is supported. */
    public final boolean VK_KHR_timeline_semaphore;
    /** When true, {@link KHRUniformBufferStandardLayout} is supported. */
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    /** When true, {@link KHRVariablePointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@link KHRVertexAttributeDivisor} is supported. */
    public final boolean VK_KHR_vertex_attribute_divisor;
    /** When true, {@link KHRVideoDecodeAV1} is supported. */
    public final boolean VK_KHR_video_decode_av1;
    /** When true, {@link KHRVideoDecodeH264} is supported. */
    public final boolean VK_KHR_video_decode_h264;
    /** When true, {@link KHRVideoDecodeH265} is supported. */
    public final boolean VK_KHR_video_decode_h265;
    /** When true, {@link KHRVideoDecodeQueue} is supported. */
    public final boolean VK_KHR_video_decode_queue;
    /** When true, {@link KHRVideoEncodeH264} is supported. */
    public final boolean VK_KHR_video_encode_h264;
    /** When true, {@link KHRVideoEncodeH265} is supported. */
    public final boolean VK_KHR_video_encode_h265;
    /** When true, {@link KHRVideoEncodeQueue} is supported. */
    public final boolean VK_KHR_video_encode_queue;
    /** When true, {@link KHRVideoMaintenance1} is supported. */
    public final boolean VK_KHR_video_maintenance1;
    /** When true, {@link KHRVideoQueue} is supported. */
    public final boolean VK_KHR_video_queue;
    /** When true, {@link KHRVulkanMemoryModel} is supported. */
    public final boolean VK_KHR_vulkan_memory_model;
    /** When true, {@link KHRWin32KeyedMutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
    /** When true, {@link KHRWorkgroupMemoryExplicitLayout} is supported. */
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    /** When true, {@link KHRZeroInitializeWorkgroupMemory} is supported. */
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    /** When true, {@link MESAImageAlignmentControl} is supported. */
    public final boolean VK_MESA_image_alignment_control;
    /** When true, {@link MSFTLayeredDriver} is supported. */
    public final boolean VK_MSFT_layered_driver;
    /** When true, {@link NVAcquireWinrtDisplay} is supported. */
    public final boolean VK_NV_acquire_winrt_display;
    /** When true, {@link NVClipSpaceWScaling} is supported. */
    public final boolean VK_NV_clip_space_w_scaling;
    /** When true, {@link NVCommandBufferInheritance} is supported. */
    public final boolean VK_NV_command_buffer_inheritance;
    /** When true, {@link NVComputeShaderDerivatives} is supported. */
    public final boolean VK_NV_compute_shader_derivatives;
    /** When true, {@link NVCooperativeMatrix} is supported. */
    public final boolean VK_NV_cooperative_matrix;
    /** When true, {@link NVCopyMemoryIndirect} is supported. */
    public final boolean VK_NV_copy_memory_indirect;
    /** When true, {@link NVCornerSampledImage} is supported. */
    public final boolean VK_NV_corner_sampled_image;
    /** When true, {@link NVCoverageReductionMode} is supported. */
    public final boolean VK_NV_coverage_reduction_mode;
    /** When true, {@link NVCudaKernelLaunch} is supported. */
    public final boolean VK_NV_cuda_kernel_launch;
    /** When true, {@link NVDedicatedAllocation} is supported. */
    public final boolean VK_NV_dedicated_allocation;
    /** When true, {@link NVDedicatedAllocationImageAliasing} is supported. */
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    /** When true, {@link NVDescriptorPoolOverallocation} is supported. */
    public final boolean VK_NV_descriptor_pool_overallocation;
    /** When true, {@link NVDeviceDiagnosticCheckpoints} is supported. */
    public final boolean VK_NV_device_diagnostic_checkpoints;
    /** When true, {@link NVDeviceDiagnosticsConfig} is supported. */
    public final boolean VK_NV_device_diagnostics_config;
    /** When true, {@link NVDeviceGeneratedCommands} is supported. */
    public final boolean VK_NV_device_generated_commands;
    /** When true, {@link NVDeviceGeneratedCommandsCompute} is supported. */
    public final boolean VK_NV_device_generated_commands_compute;
    /** When true, {@link NVDisplacementMicromap} is supported. */
    public final boolean VK_NV_displacement_micromap;
    /** When true, {@link NVExtendedSparseAddressSpace} is supported. */
    public final boolean VK_NV_extended_sparse_address_space;
    /** When true, {@link NVExternalMemory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@link NVExternalMemoryRdma} is supported. */
    public final boolean VK_NV_external_memory_rdma;
    /** When true, {@link NVExternalMemoryWin32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@link NVFragmentShaderBarycentric} is supported. */
    public final boolean VK_NV_fragment_shader_barycentric;
    /** When true, {@link NVFragmentShadingRateEnums} is supported. */
    public final boolean VK_NV_fragment_shading_rate_enums;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@link NVGeometryShaderPassthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@link NVGLSLShader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@link NVInheritedViewportScissor} is supported. */
    public final boolean VK_NV_inherited_viewport_scissor;
    /** When true, {@link NVLinearColorAttachment} is supported. */
    public final boolean VK_NV_linear_color_attachment;
    /** When true, {@link NVLowLatency} is supported. */
    public final boolean VK_NV_low_latency;
    /** When true, {@link NVLowLatency2} is supported. */
    public final boolean VK_NV_low_latency2;
    /** When true, {@link NVMemoryDecompression} is supported. */
    public final boolean VK_NV_memory_decompression;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@link NVOpticalFlow} is supported. */
    public final boolean VK_NV_optical_flow;
    /** When true, {@link NVPerStageDescriptorSet} is supported. */
    public final boolean VK_NV_per_stage_descriptor_set;
    /** When true, {@link NVPresentBarrier} is supported. */
    public final boolean VK_NV_present_barrier;
    /** When true, {@link NVRawAccessChains} is supported. */
    public final boolean VK_NV_raw_access_chains;
    /** When true, {@link NVRayTracing} is supported. */
    public final boolean VK_NV_ray_tracing;
    /** When true, {@link NVRayTracingInvocationReorder} is supported. */
    public final boolean VK_NV_ray_tracing_invocation_reorder;
    /** When true, {@link NVRayTracingMotionBlur} is supported. */
    public final boolean VK_NV_ray_tracing_motion_blur;
    /** When true, {@link NVRayTracingValidation} is supported. */
    public final boolean VK_NV_ray_tracing_validation;
    /** When true, {@link NVRepresentativeFragmentTest} is supported. */
    public final boolean VK_NV_representative_fragment_test;
    /** When true, {@link NVSampleMaskOverrideCoverage} is supported. */
    public final boolean VK_NV_sample_mask_override_coverage;
    /** When true, {@link NVScissorExclusive} is supported. */
    public final boolean VK_NV_scissor_exclusive;
    /** When true, {@link NVShaderAtomicFloat16Vector} is supported. */
    public final boolean VK_NV_shader_atomic_float16_vector;
    /** When true, {@link NVShaderImageFootprint} is supported. */
    public final boolean VK_NV_shader_image_footprint;
    /** When true, {@link NVShaderSmBuiltins} is supported. */
    public final boolean VK_NV_shader_sm_builtins;
    /** When true, {@link NVShaderSubgroupPartitioned} is supported. */
    public final boolean VK_NV_shader_subgroup_partitioned;
    /** When true, {@link NVShadingRateImage} is supported. */
    public final boolean VK_NV_shading_rate_image;
    /** When true, {@link NVViewportArray2} is supported. */
    public final boolean VK_NV_viewport_array2;
    /** When true, {@link NVViewportSwizzle} is supported. */
    public final boolean VK_NV_viewport_swizzle;
    /** When true, {@link NVWin32KeyedMutex} is supported. */
    public final boolean VK_NV_win32_keyed_mutex;
    /** When true, {@link NVXBinaryImport} is supported. */
    public final boolean VK_NVX_binary_import;
    /** When true, {@link NVXImageViewHandle} is supported. */
    public final boolean VK_NVX_image_view_handle;
    /** When true, {@link NVXMultiviewPerViewAttributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;
    /** When true, {@link QCOMFilterCubicClamp} is supported. */
    public final boolean VK_QCOM_filter_cubic_clamp;
    /** When true, {@link QCOMFilterCubicWeights} is supported. */
    public final boolean VK_QCOM_filter_cubic_weights;
    /** When true, {@link QCOMFragmentDensityMapOffset} is supported. */
    public final boolean VK_QCOM_fragment_density_map_offset;
    /** When true, {@link QCOMImageProcessing} is supported. */
    public final boolean VK_QCOM_image_processing;
    /** When true, {@link QCOMImageProcessing2} is supported. */
    public final boolean VK_QCOM_image_processing2;
    /** When true, {@link QCOMMultiviewPerViewRenderAreas} is supported. */
    public final boolean VK_QCOM_multiview_per_view_render_areas;
    /** When true, {@link QCOMMultiviewPerViewViewports} is supported. */
    public final boolean VK_QCOM_multiview_per_view_viewports;
    /** When true, {@link QCOMRenderPassShaderResolve} is supported. */
    public final boolean VK_QCOM_render_pass_shader_resolve;
    /** When true, {@link QCOMRenderPassStoreOps} is supported. */
    public final boolean VK_QCOM_render_pass_store_ops;
    /** When true, {@link QCOMRenderPassTransform} is supported. */
    public final boolean VK_QCOM_render_pass_transform;
    /** When true, {@link QCOMRotatedCopyCommands} is supported. */
    public final boolean VK_QCOM_rotated_copy_commands;
    /** When true, {@link QCOMTileProperties} is supported. */
    public final boolean VK_QCOM_tile_properties;
    /** When true, {@link QCOMYcbcrDegamma} is supported. */
    public final boolean VK_QCOM_ycbcr_degamma;
    /** When true, {@link SECAmigoProfiling} is supported. */
    public final boolean VK_SEC_amigo_profiling;
    /** When true, {@code STD_vulkan_video_codec_av1} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_av1;
    /** When true, {@code STD_vulkan_video_codec_h264} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h264;
    /** When true, {@code STD_vulkan_video_codec_h265} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h265;
    /** When true, {@link VALVEDescriptorSetHostMapping} is supported. */
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    /** When true, {@link VALVEMutableDescriptorType} is supported. */
    public final boolean VK_VALVE_mutable_descriptor_type;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[559];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = check_VK12(provider, caps, ext);
        Vulkan13 = check_VK13(provider, caps, ext);
        VK_AMD_anti_lag = check_AMD_anti_lag(provider, caps, ext);
        VK_AMD_buffer_marker = check_AMD_buffer_marker(provider, caps, ext);
        VK_AMD_device_coherent_memory = ext.contains("VK_AMD_device_coherent_memory");
        VK_AMD_display_native_hdr = check_AMD_display_native_hdr(provider, caps, ext);
        VK_AMD_draw_indirect_count = check_AMD_draw_indirect_count(provider, caps, ext);
        VK_AMD_gcn_shader = ext.contains("VK_AMD_gcn_shader");
        VK_AMD_gpu_shader_half_float = ext.contains("VK_AMD_gpu_shader_half_float");
        VK_AMD_gpu_shader_int16 = ext.contains("VK_AMD_gpu_shader_int16");
        VK_AMD_memory_overallocation_behavior = ext.contains("VK_AMD_memory_overallocation_behavior");
        VK_AMD_mixed_attachment_samples = ext.contains("VK_AMD_mixed_attachment_samples");
        VK_AMD_negative_viewport_height = ext.contains("VK_AMD_negative_viewport_height");
        VK_AMD_pipeline_compiler_control = ext.contains("VK_AMD_pipeline_compiler_control");
        VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
        VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
        VK_AMD_shader_core_properties = ext.contains("VK_AMD_shader_core_properties");
        VK_AMD_shader_core_properties2 = ext.contains("VK_AMD_shader_core_properties2");
        VK_AMD_shader_early_and_late_fragment_tests = ext.contains("VK_AMD_shader_early_and_late_fragment_tests");
        VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
        VK_AMD_shader_fragment_mask = ext.contains("VK_AMD_shader_fragment_mask");
        VK_AMD_shader_image_load_store_lod = ext.contains("VK_AMD_shader_image_load_store_lod");
        VK_AMD_shader_info = check_AMD_shader_info(provider, caps, ext);
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_AMDX_shader_enqueue = check_AMDX_shader_enqueue(provider, caps, ext);
        VK_ANDROID_external_format_resolve = ext.contains("VK_ANDROID_external_format_resolve");
        VK_ANDROID_external_memory_android_hardware_buffer = check_ANDROID_external_memory_android_hardware_buffer(provider, caps, ext);
        VK_ARM_rasterization_order_attachment_access = ext.contains("VK_ARM_rasterization_order_attachment_access");
        VK_ARM_render_pass_striped = ext.contains("VK_ARM_render_pass_striped");
        VK_ARM_scheduling_controls = ext.contains("VK_ARM_scheduling_controls");
        VK_ARM_shader_core_builtins = ext.contains("VK_ARM_shader_core_builtins");
        VK_ARM_shader_core_properties = ext.contains("VK_ARM_shader_core_properties");
        VK_EXT_4444_formats = ext.contains("VK_EXT_4444_formats");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_attachment_feedback_loop_dynamic_state = check_EXT_attachment_feedback_loop_dynamic_state(provider, caps, ext);
        VK_EXT_attachment_feedback_loop_layout = ext.contains("VK_EXT_attachment_feedback_loop_layout");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_border_color_swizzle = ext.contains("VK_EXT_border_color_swizzle");
        VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_custom_border_color = ext.contains("VK_EXT_custom_border_color");
        VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        VK_EXT_depth_bias_control = check_EXT_depth_bias_control(provider, caps, ext);
        VK_EXT_depth_clamp_zero_one = ext.contains("VK_EXT_depth_clamp_zero_one");
        VK_EXT_depth_clip_control = ext.contains("VK_EXT_depth_clip_control");
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_buffer = check_EXT_descriptor_buffer(provider, caps, ext);
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_device_address_binding_report = ext.contains("VK_EXT_device_address_binding_report");
        VK_EXT_device_fault = check_EXT_device_fault(provider, caps, ext);
        VK_EXT_device_memory_report = ext.contains("VK_EXT_device_memory_report");
        VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        VK_EXT_dynamic_rendering_unused_attachments = ext.contains("VK_EXT_dynamic_rendering_unused_attachments");
        VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        VK_EXT_extended_dynamic_state3 = check_EXT_extended_dynamic_state3(provider, caps, ext);
        VK_EXT_external_memory_acquire_unmodified = ext.contains("VK_EXT_external_memory_acquire_unmodified");
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_density_map2 = ext.contains("VK_EXT_fragment_density_map2");
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_frame_boundary = ext.contains("VK_EXT_frame_boundary");
        VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_global_priority_query = ext.contains("VK_EXT_global_priority_query");
        VK_EXT_graphics_pipeline_library = ext.contains("VK_EXT_graphics_pipeline_library");
        VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        VK_EXT_host_image_copy = check_EXT_host_image_copy(provider, caps, ext);
        VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        VK_EXT_image_2d_view_of_3d = ext.contains("VK_EXT_image_2d_view_of_3d");
        VK_EXT_image_compression_control = check_EXT_image_compression_control(provider, caps, ext);
        VK_EXT_image_compression_control_swapchain = ext.contains("VK_EXT_image_compression_control_swapchain");
        VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        VK_EXT_image_robustness = ext.contains("VK_EXT_image_robustness");
        VK_EXT_image_sliced_view_of_3d = ext.contains("VK_EXT_image_sliced_view_of_3d");
        VK_EXT_image_view_min_lod = ext.contains("VK_EXT_image_view_min_lod");
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_legacy_dithering = ext.contains("VK_EXT_legacy_dithering");
        VK_EXT_legacy_vertex_attributes = ext.contains("VK_EXT_legacy_vertex_attributes");
        VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        VK_EXT_load_store_op_none = ext.contains("VK_EXT_load_store_op_none");
        VK_EXT_map_memory_placed = ext.contains("VK_EXT_map_memory_placed");
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        VK_EXT_metal_objects = check_EXT_metal_objects(provider, caps, ext);
        VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        VK_EXT_multisampled_render_to_single_sampled = ext.contains("VK_EXT_multisampled_render_to_single_sampled");
        VK_EXT_mutable_descriptor_type = ext.contains("VK_EXT_mutable_descriptor_type");
        VK_EXT_nested_command_buffer = ext.contains("VK_EXT_nested_command_buffer");
        VK_EXT_non_seamless_cube_map = ext.contains("VK_EXT_non_seamless_cube_map");
        VK_EXT_opacity_micromap = check_EXT_opacity_micromap(provider, caps, ext);
        VK_EXT_pageable_device_local_memory = check_EXT_pageable_device_local_memory(provider, caps, ext);
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_physical_device_drm = ext.contains("VK_EXT_physical_device_drm");
        VK_EXT_pipeline_creation_cache_control = ext.contains("VK_EXT_pipeline_creation_cache_control");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_pipeline_library_group_handles = ext.contains("VK_EXT_pipeline_library_group_handles");
        VK_EXT_pipeline_properties = check_EXT_pipeline_properties(provider, caps, ext);
        VK_EXT_pipeline_protected_access = ext.contains("VK_EXT_pipeline_protected_access");
        VK_EXT_pipeline_robustness = ext.contains("VK_EXT_pipeline_robustness");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_primitive_topology_list_restart = ext.contains("VK_EXT_primitive_topology_list_restart");
        VK_EXT_primitives_generated_query = ext.contains("VK_EXT_primitives_generated_query");
        VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        VK_EXT_provoking_vertex = ext.contains("VK_EXT_provoking_vertex");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_rasterization_order_attachment_access = ext.contains("VK_EXT_rasterization_order_attachment_access");
        VK_EXT_rgba10x6_formats = ext.contains("VK_EXT_rgba10x6_formats");
        VK_EXT_robustness2 = ext.contains("VK_EXT_robustness2");
        VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_atomic_float = ext.contains("VK_EXT_shader_atomic_float");
        VK_EXT_shader_atomic_float2 = ext.contains("VK_EXT_shader_atomic_float2");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_image_atomic_int64 = ext.contains("VK_EXT_shader_image_atomic_int64");
        VK_EXT_shader_module_identifier = check_EXT_shader_module_identifier(provider, caps, ext);
        VK_EXT_shader_object = check_EXT_shader_object(provider, caps, ext);
        VK_EXT_shader_replicated_composites = ext.contains("VK_EXT_shader_replicated_composites");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_tile_image = ext.contains("VK_EXT_shader_tile_image");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_subpass_merge_feedback = ext.contains("VK_EXT_subpass_merge_feedback");
        VK_EXT_swapchain_maintenance1 = check_EXT_swapchain_maintenance1(provider, caps, ext);
        VK_EXT_texel_buffer_alignment = ext.contains("VK_EXT_texel_buffer_alignment");
        VK_EXT_texture_compression_astc_hdr = ext.contains("VK_EXT_texture_compression_astc_hdr");
        VK_EXT_tooling_info = ext.contains("VK_EXT_tooling_info");
        VK_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        VK_EXT_validation_cache = check_EXT_validation_cache(provider, caps, ext);
        VK_EXT_vertex_attribute_divisor = ext.contains("VK_EXT_vertex_attribute_divisor");
        VK_EXT_vertex_input_dynamic_state = check_EXT_vertex_input_dynamic_state(provider, caps, ext);
        VK_EXT_ycbcr_2plane_444_formats = ext.contains("VK_EXT_ycbcr_2plane_444_formats");
        VK_EXT_ycbcr_image_arrays = ext.contains("VK_EXT_ycbcr_image_arrays");
        VK_GOOGLE_decorate_string = ext.contains("VK_GOOGLE_decorate_string");
        VK_GOOGLE_display_timing = check_GOOGLE_display_timing(provider, caps, ext);
        VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        VK_GOOGLE_user_type = ext.contains("VK_GOOGLE_user_type");
        VK_HUAWEI_cluster_culling_shader = check_HUAWEI_cluster_culling_shader(provider, caps, ext);
        VK_HUAWEI_invocation_mask = check_HUAWEI_invocation_mask(provider, caps, ext);
        VK_HUAWEI_subpass_shading = check_HUAWEI_subpass_shading(provider, caps, ext);
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_IMG_relaxed_line_rasterization = ext.contains("VK_IMG_relaxed_line_rasterization");
        VK_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        VK_INTEL_shader_integer_functions2 = ext.contains("VK_INTEL_shader_integer_functions2");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        VK_KHR_8bit_storage = ext.contains("VK_KHR_8bit_storage");
        VK_KHR_acceleration_structure = check_KHR_acceleration_structure(provider, caps, ext);
        VK_KHR_bind_memory2 = check_KHR_bind_memory2(provider, caps, ext);
        VK_KHR_buffer_device_address = check_KHR_buffer_device_address(provider, caps, ext);
        VK_KHR_calibrated_timestamps = check_KHR_calibrated_timestamps(provider, caps, ext);
        VK_KHR_compute_shader_derivatives = ext.contains("VK_KHR_compute_shader_derivatives");
        VK_KHR_cooperative_matrix = ext.contains("VK_KHR_cooperative_matrix");
        VK_KHR_copy_commands2 = check_KHR_copy_commands2(provider, caps, ext);
        VK_KHR_create_renderpass2 = check_KHR_create_renderpass2(provider, caps, ext);
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        VK_KHR_deferred_host_operations = check_KHR_deferred_host_operations(provider, caps, ext);
        VK_KHR_depth_stencil_resolve = ext.contains("VK_KHR_depth_stencil_resolve");
        VK_KHR_descriptor_update_template = check_KHR_descriptor_update_template(provider, caps, ext);
        VK_KHR_device_group = check_KHR_device_group(provider, caps, ext);
        VK_KHR_display_swapchain = check_KHR_display_swapchain(provider, caps, ext);
        VK_KHR_draw_indirect_count = check_KHR_draw_indirect_count(provider, caps, ext);
        VK_KHR_driver_properties = ext.contains("VK_KHR_driver_properties");
        VK_KHR_dynamic_rendering = check_KHR_dynamic_rendering(provider, caps, ext);
        VK_KHR_dynamic_rendering_local_read = check_KHR_dynamic_rendering_local_read(provider, caps, ext);
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        VK_KHR_external_fence_fd = check_KHR_external_fence_fd(provider, caps, ext);
        VK_KHR_external_fence_win32 = check_KHR_external_fence_win32(provider, caps, ext);
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        VK_KHR_external_memory_fd = check_KHR_external_memory_fd(provider, caps, ext);
        VK_KHR_external_memory_win32 = check_KHR_external_memory_win32(provider, caps, ext);
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        VK_KHR_external_semaphore_fd = check_KHR_external_semaphore_fd(provider, caps, ext);
        VK_KHR_external_semaphore_win32 = check_KHR_external_semaphore_win32(provider, caps, ext);
        VK_KHR_format_feature_flags2 = ext.contains("VK_KHR_format_feature_flags2");
        VK_KHR_fragment_shader_barycentric = ext.contains("VK_KHR_fragment_shader_barycentric");
        VK_KHR_fragment_shading_rate = check_KHR_fragment_shading_rate(provider, caps, ext);
        VK_KHR_get_memory_requirements2 = check_KHR_get_memory_requirements2(provider, caps, ext);
        VK_KHR_global_priority = ext.contains("VK_KHR_global_priority");
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_imageless_framebuffer = ext.contains("VK_KHR_imageless_framebuffer");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        VK_KHR_index_type_uint8 = ext.contains("VK_KHR_index_type_uint8");
        VK_KHR_line_rasterization = check_KHR_line_rasterization(provider, caps, ext);
        VK_KHR_load_store_op_none = ext.contains("VK_KHR_load_store_op_none");
        VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        VK_KHR_maintenance4 = check_KHR_maintenance4(provider, caps, ext);
        VK_KHR_maintenance5 = check_KHR_maintenance5(provider, caps, ext);
        VK_KHR_maintenance6 = check_KHR_maintenance6(provider, caps, ext);
        VK_KHR_maintenance7 = ext.contains("VK_KHR_maintenance7");
        VK_KHR_map_memory2 = check_KHR_map_memory2(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        VK_KHR_pipeline_binary = check_KHR_pipeline_binary(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        VK_KHR_pipeline_library = ext.contains("VK_KHR_pipeline_library");
        VK_KHR_portability_subset = ext.contains("VK_KHR_portability_subset");
        VK_KHR_present_id = ext.contains("VK_KHR_present_id");
        VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        VK_KHR_ray_query = ext.contains("VK_KHR_ray_query");
        VK_KHR_ray_tracing_maintenance1 = check_KHR_ray_tracing_maintenance1(provider, caps, ext);
        VK_KHR_ray_tracing_pipeline = check_KHR_ray_tracing_pipeline(provider, caps, ext);
        VK_KHR_ray_tracing_position_fetch = ext.contains("VK_KHR_ray_tracing_position_fetch");
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        VK_KHR_sampler_ycbcr_conversion = check_KHR_sampler_ycbcr_conversion(provider, caps, ext);
        VK_KHR_separate_depth_stencil_layouts = ext.contains("VK_KHR_separate_depth_stencil_layouts");
        VK_KHR_shader_atomic_int64 = ext.contains("VK_KHR_shader_atomic_int64");
        VK_KHR_shader_clock = ext.contains("VK_KHR_shader_clock");
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        VK_KHR_shader_expect_assume = ext.contains("VK_KHR_shader_expect_assume");
        VK_KHR_shader_float16_int8 = ext.contains("VK_KHR_shader_float16_int8");
        VK_KHR_shader_float_controls = ext.contains("VK_KHR_shader_float_controls");
        VK_KHR_shader_float_controls2 = ext.contains("VK_KHR_shader_float_controls2");
        VK_KHR_shader_integer_dot_product = ext.contains("VK_KHR_shader_integer_dot_product");
        VK_KHR_shader_maximal_reconvergence = ext.contains("VK_KHR_shader_maximal_reconvergence");
        VK_KHR_shader_non_semantic_info = ext.contains("VK_KHR_shader_non_semantic_info");
        VK_KHR_shader_quad_control = ext.contains("VK_KHR_shader_quad_control");
        VK_KHR_shader_relaxed_extended_instruction = ext.contains("VK_KHR_shader_relaxed_extended_instruction");
        VK_KHR_shader_subgroup_extended_types = ext.contains("VK_KHR_shader_subgroup_extended_types");
        VK_KHR_shader_subgroup_rotate = ext.contains("VK_KHR_shader_subgroup_rotate");
        VK_KHR_shader_subgroup_uniform_control_flow = ext.contains("VK_KHR_shader_subgroup_uniform_control_flow");
        VK_KHR_shader_terminate_invocation = ext.contains("VK_KHR_shader_terminate_invocation");
        VK_KHR_shared_presentable_image = check_KHR_shared_presentable_image(provider, caps, ext);
        VK_KHR_spirv_1_4 = ext.contains("VK_KHR_spirv_1_4");
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        VK_KHR_swapchain = check_KHR_swapchain(provider, caps, ext);
        VK_KHR_swapchain_mutable_format = ext.contains("VK_KHR_swapchain_mutable_format");
        VK_KHR_synchronization2 = check_KHR_synchronization2(provider, caps, ext);
        VK_KHR_timeline_semaphore = check_KHR_timeline_semaphore(provider, caps, ext);
        VK_KHR_uniform_buffer_standard_layout = ext.contains("VK_KHR_uniform_buffer_standard_layout");
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_vertex_attribute_divisor = ext.contains("VK_KHR_vertex_attribute_divisor");
        VK_KHR_video_decode_av1 = ext.contains("VK_KHR_video_decode_av1");
        VK_KHR_video_decode_h264 = ext.contains("VK_KHR_video_decode_h264");
        VK_KHR_video_decode_h265 = ext.contains("VK_KHR_video_decode_h265");
        VK_KHR_video_decode_queue = check_KHR_video_decode_queue(provider, caps, ext);
        VK_KHR_video_encode_h264 = ext.contains("VK_KHR_video_encode_h264");
        VK_KHR_video_encode_h265 = ext.contains("VK_KHR_video_encode_h265");
        VK_KHR_video_encode_queue = check_KHR_video_encode_queue(provider, caps, ext);
        VK_KHR_video_maintenance1 = ext.contains("VK_KHR_video_maintenance1");
        VK_KHR_video_queue = check_KHR_video_queue(provider, caps, ext);
        VK_KHR_vulkan_memory_model = ext.contains("VK_KHR_vulkan_memory_model");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        VK_KHR_workgroup_memory_explicit_layout = ext.contains("VK_KHR_workgroup_memory_explicit_layout");
        VK_KHR_zero_initialize_workgroup_memory = ext.contains("VK_KHR_zero_initialize_workgroup_memory");
        VK_MESA_image_alignment_control = ext.contains("VK_MESA_image_alignment_control");
        VK_MSFT_layered_driver = ext.contains("VK_MSFT_layered_driver");
        VK_NV_acquire_winrt_display = ext.contains("VK_NV_acquire_winrt_display");
        VK_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        VK_NV_command_buffer_inheritance = ext.contains("VK_NV_command_buffer_inheritance");
        VK_NV_compute_shader_derivatives = ext.contains("VK_NV_compute_shader_derivatives");
        VK_NV_cooperative_matrix = ext.contains("VK_NV_cooperative_matrix");
        VK_NV_copy_memory_indirect = check_NV_copy_memory_indirect(provider, caps, ext);
        VK_NV_corner_sampled_image = ext.contains("VK_NV_corner_sampled_image");
        VK_NV_coverage_reduction_mode = ext.contains("VK_NV_coverage_reduction_mode");
        VK_NV_cuda_kernel_launch = check_NV_cuda_kernel_launch(provider, caps, ext);
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_dedicated_allocation_image_aliasing = ext.contains("VK_NV_dedicated_allocation_image_aliasing");
        VK_NV_descriptor_pool_overallocation = ext.contains("VK_NV_descriptor_pool_overallocation");
        VK_NV_device_diagnostic_checkpoints = check_NV_device_diagnostic_checkpoints(provider, caps, ext);
        VK_NV_device_diagnostics_config = ext.contains("VK_NV_device_diagnostics_config");
        VK_NV_device_generated_commands = check_NV_device_generated_commands(provider, caps, ext);
        VK_NV_device_generated_commands_compute = check_NV_device_generated_commands_compute(provider, caps, ext);
        VK_NV_displacement_micromap = ext.contains("VK_NV_displacement_micromap");
        VK_NV_extended_sparse_address_space = ext.contains("VK_NV_extended_sparse_address_space");
        VK_NV_external_memory = ext.contains("VK_NV_external_memory");
        VK_NV_external_memory_rdma = check_NV_external_memory_rdma(provider, caps, ext);
        VK_NV_external_memory_win32 = check_NV_external_memory_win32(provider, caps, ext);
        VK_NV_fill_rectangle = ext.contains("VK_NV_fill_rectangle");
        VK_NV_fragment_coverage_to_color = ext.contains("VK_NV_fragment_coverage_to_color");
        VK_NV_fragment_shader_barycentric = ext.contains("VK_NV_fragment_shader_barycentric");
        VK_NV_fragment_shading_rate_enums = check_NV_fragment_shading_rate_enums(provider, caps, ext);
        VK_NV_framebuffer_mixed_samples = ext.contains("VK_NV_framebuffer_mixed_samples");
        VK_NV_geometry_shader_passthrough = ext.contains("VK_NV_geometry_shader_passthrough");
        VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
        VK_NV_inherited_viewport_scissor = ext.contains("VK_NV_inherited_viewport_scissor");
        VK_NV_linear_color_attachment = ext.contains("VK_NV_linear_color_attachment");
        VK_NV_low_latency = ext.contains("VK_NV_low_latency");
        VK_NV_low_latency2 = check_NV_low_latency2(provider, caps, ext);
        VK_NV_memory_decompression = check_NV_memory_decompression(provider, caps, ext);
        VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        VK_NV_optical_flow = check_NV_optical_flow(provider, caps, ext);
        VK_NV_per_stage_descriptor_set = ext.contains("VK_NV_per_stage_descriptor_set");
        VK_NV_present_barrier = ext.contains("VK_NV_present_barrier");
        VK_NV_raw_access_chains = ext.contains("VK_NV_raw_access_chains");
        VK_NV_ray_tracing = check_NV_ray_tracing(provider, caps, ext);
        VK_NV_ray_tracing_invocation_reorder = ext.contains("VK_NV_ray_tracing_invocation_reorder");
        VK_NV_ray_tracing_motion_blur = ext.contains("VK_NV_ray_tracing_motion_blur");
        VK_NV_ray_tracing_validation = ext.contains("VK_NV_ray_tracing_validation");
        VK_NV_representative_fragment_test = ext.contains("VK_NV_representative_fragment_test");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        VK_NV_shader_atomic_float16_vector = ext.contains("VK_NV_shader_atomic_float16_vector");
        VK_NV_shader_image_footprint = ext.contains("VK_NV_shader_image_footprint");
        VK_NV_shader_sm_builtins = ext.contains("VK_NV_shader_sm_builtins");
        VK_NV_shader_subgroup_partitioned = ext.contains("VK_NV_shader_subgroup_partitioned");
        VK_NV_shading_rate_image = check_NV_shading_rate_image(provider, caps, ext);
        VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        VK_NV_viewport_swizzle = ext.contains("VK_NV_viewport_swizzle");
        VK_NV_win32_keyed_mutex = ext.contains("VK_NV_win32_keyed_mutex");
        VK_NVX_binary_import = check_NVX_binary_import(provider, caps, ext);
        VK_NVX_image_view_handle = check_NVX_image_view_handle(provider, caps, ext);
        VK_NVX_multiview_per_view_attributes = ext.contains("VK_NVX_multiview_per_view_attributes");
        VK_QCOM_filter_cubic_clamp = ext.contains("VK_QCOM_filter_cubic_clamp");
        VK_QCOM_filter_cubic_weights = ext.contains("VK_QCOM_filter_cubic_weights");
        VK_QCOM_fragment_density_map_offset = ext.contains("VK_QCOM_fragment_density_map_offset");
        VK_QCOM_image_processing = ext.contains("VK_QCOM_image_processing");
        VK_QCOM_image_processing2 = ext.contains("VK_QCOM_image_processing2");
        VK_QCOM_multiview_per_view_render_areas = ext.contains("VK_QCOM_multiview_per_view_render_areas");
        VK_QCOM_multiview_per_view_viewports = ext.contains("VK_QCOM_multiview_per_view_viewports");
        VK_QCOM_render_pass_shader_resolve = ext.contains("VK_QCOM_render_pass_shader_resolve");
        VK_QCOM_render_pass_store_ops = ext.contains("VK_QCOM_render_pass_store_ops");
        VK_QCOM_render_pass_transform = ext.contains("VK_QCOM_render_pass_transform");
        VK_QCOM_rotated_copy_commands = ext.contains("VK_QCOM_rotated_copy_commands");
        VK_QCOM_tile_properties = check_QCOM_tile_properties(provider, caps, ext);
        VK_QCOM_ycbcr_degamma = ext.contains("VK_QCOM_ycbcr_degamma");
        VK_SEC_amigo_profiling = ext.contains("VK_SEC_amigo_profiling");
        STD_VIDEO_STD_vulkan_video_codec_av1 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_av1");
        STD_VIDEO_STD_vulkan_video_codec_h264 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h264");
        STD_VIDEO_STD_vulkan_video_codec_h265 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h265");
        VK_VALVE_descriptor_set_host_mapping = check_VALVE_descriptor_set_host_mapping(provider, caps, ext);
        VK_VALVE_mutable_descriptor_type = ext.contains("VK_VALVE_mutable_descriptor_type");

        vkGetDeviceProcAddr = caps[0];
        vkDestroyDevice = caps[1];
        vkGetDeviceQueue = caps[2];
        vkQueueSubmit = caps[3];
        vkQueueWaitIdle = caps[4];
        vkDeviceWaitIdle = caps[5];
        vkAllocateMemory = caps[6];
        vkFreeMemory = caps[7];
        vkMapMemory = caps[8];
        vkUnmapMemory = caps[9];
        vkFlushMappedMemoryRanges = caps[10];
        vkInvalidateMappedMemoryRanges = caps[11];
        vkGetDeviceMemoryCommitment = caps[12];
        vkBindBufferMemory = caps[13];
        vkBindImageMemory = caps[14];
        vkGetBufferMemoryRequirements = caps[15];
        vkGetImageMemoryRequirements = caps[16];
        vkGetImageSparseMemoryRequirements = caps[17];
        vkQueueBindSparse = caps[18];
        vkCreateFence = caps[19];
        vkDestroyFence = caps[20];
        vkResetFences = caps[21];
        vkGetFenceStatus = caps[22];
        vkWaitForFences = caps[23];
        vkCreateSemaphore = caps[24];
        vkDestroySemaphore = caps[25];
        vkCreateEvent = caps[26];
        vkDestroyEvent = caps[27];
        vkGetEventStatus = caps[28];
        vkSetEvent = caps[29];
        vkResetEvent = caps[30];
        vkCreateQueryPool = caps[31];
        vkDestroyQueryPool = caps[32];
        vkGetQueryPoolResults = caps[33];
        vkCreateBuffer = caps[34];
        vkDestroyBuffer = caps[35];
        vkCreateBufferView = caps[36];
        vkDestroyBufferView = caps[37];
        vkCreateImage = caps[38];
        vkDestroyImage = caps[39];
        vkGetImageSubresourceLayout = caps[40];
        vkCreateImageView = caps[41];
        vkDestroyImageView = caps[42];
        vkCreateShaderModule = caps[43];
        vkDestroyShaderModule = caps[44];
        vkCreatePipelineCache = caps[45];
        vkDestroyPipelineCache = caps[46];
        vkGetPipelineCacheData = caps[47];
        vkMergePipelineCaches = caps[48];
        vkCreateGraphicsPipelines = caps[49];
        vkCreateComputePipelines = caps[50];
        vkDestroyPipeline = caps[51];
        vkCreatePipelineLayout = caps[52];
        vkDestroyPipelineLayout = caps[53];
        vkCreateSampler = caps[54];
        vkDestroySampler = caps[55];
        vkCreateDescriptorSetLayout = caps[56];
        vkDestroyDescriptorSetLayout = caps[57];
        vkCreateDescriptorPool = caps[58];
        vkDestroyDescriptorPool = caps[59];
        vkResetDescriptorPool = caps[60];
        vkAllocateDescriptorSets = caps[61];
        vkFreeDescriptorSets = caps[62];
        vkUpdateDescriptorSets = caps[63];
        vkCreateFramebuffer = caps[64];
        vkDestroyFramebuffer = caps[65];
        vkCreateRenderPass = caps[66];
        vkDestroyRenderPass = caps[67];
        vkGetRenderAreaGranularity = caps[68];
        vkCreateCommandPool = caps[69];
        vkDestroyCommandPool = caps[70];
        vkResetCommandPool = caps[71];
        vkAllocateCommandBuffers = caps[72];
        vkFreeCommandBuffers = caps[73];
        vkBeginCommandBuffer = caps[74];
        vkEndCommandBuffer = caps[75];
        vkResetCommandBuffer = caps[76];
        vkCmdBindPipeline = caps[77];
        vkCmdSetViewport = caps[78];
        vkCmdSetScissor = caps[79];
        vkCmdSetLineWidth = caps[80];
        vkCmdSetDepthBias = caps[81];
        vkCmdSetBlendConstants = caps[82];
        vkCmdSetDepthBounds = caps[83];
        vkCmdSetStencilCompareMask = caps[84];
        vkCmdSetStencilWriteMask = caps[85];
        vkCmdSetStencilReference = caps[86];
        vkCmdBindDescriptorSets = caps[87];
        vkCmdBindIndexBuffer = caps[88];
        vkCmdBindVertexBuffers = caps[89];
        vkCmdDraw = caps[90];
        vkCmdDrawIndexed = caps[91];
        vkCmdDrawIndirect = caps[92];
        vkCmdDrawIndexedIndirect = caps[93];
        vkCmdDispatch = caps[94];
        vkCmdDispatchIndirect = caps[95];
        vkCmdCopyBuffer = caps[96];
        vkCmdCopyImage = caps[97];
        vkCmdBlitImage = caps[98];
        vkCmdCopyBufferToImage = caps[99];
        vkCmdCopyImageToBuffer = caps[100];
        vkCmdUpdateBuffer = caps[101];
        vkCmdFillBuffer = caps[102];
        vkCmdClearColorImage = caps[103];
        vkCmdClearDepthStencilImage = caps[104];
        vkCmdClearAttachments = caps[105];
        vkCmdResolveImage = caps[106];
        vkCmdSetEvent = caps[107];
        vkCmdResetEvent = caps[108];
        vkCmdWaitEvents = caps[109];
        vkCmdPipelineBarrier = caps[110];
        vkCmdBeginQuery = caps[111];
        vkCmdEndQuery = caps[112];
        vkCmdResetQueryPool = caps[113];
        vkCmdWriteTimestamp = caps[114];
        vkCmdCopyQueryPoolResults = caps[115];
        vkCmdPushConstants = caps[116];
        vkCmdBeginRenderPass = caps[117];
        vkCmdNextSubpass = caps[118];
        vkCmdEndRenderPass = caps[119];
        vkCmdExecuteCommands = caps[120];
        vkBindBufferMemory2 = caps[121];
        vkBindImageMemory2 = caps[122];
        vkGetDeviceGroupPeerMemoryFeatures = caps[123];
        vkCmdSetDeviceMask = caps[124];
        vkCmdDispatchBase = caps[125];
        vkGetImageMemoryRequirements2 = caps[126];
        vkGetBufferMemoryRequirements2 = caps[127];
        vkGetImageSparseMemoryRequirements2 = caps[128];
        vkTrimCommandPool = caps[129];
        vkGetDeviceQueue2 = caps[130];
        vkCreateSamplerYcbcrConversion = caps[131];
        vkDestroySamplerYcbcrConversion = caps[132];
        vkCreateDescriptorUpdateTemplate = caps[133];
        vkDestroyDescriptorUpdateTemplate = caps[134];
        vkUpdateDescriptorSetWithTemplate = caps[135];
        vkGetDescriptorSetLayoutSupport = caps[136];
        vkCmdDrawIndirectCount = caps[137];
        vkCmdDrawIndexedIndirectCount = caps[138];
        vkCreateRenderPass2 = caps[139];
        vkCmdBeginRenderPass2 = caps[140];
        vkCmdNextSubpass2 = caps[141];
        vkCmdEndRenderPass2 = caps[142];
        vkResetQueryPool = caps[143];
        vkGetSemaphoreCounterValue = caps[144];
        vkWaitSemaphores = caps[145];
        vkSignalSemaphore = caps[146];
        vkGetBufferDeviceAddress = caps[147];
        vkGetBufferOpaqueCaptureAddress = caps[148];
        vkGetDeviceMemoryOpaqueCaptureAddress = caps[149];
        vkCreatePrivateDataSlot = caps[150];
        vkDestroyPrivateDataSlot = caps[151];
        vkSetPrivateData = caps[152];
        vkGetPrivateData = caps[153];
        vkCmdSetEvent2 = caps[154];
        vkCmdResetEvent2 = caps[155];
        vkCmdWaitEvents2 = caps[156];
        vkCmdPipelineBarrier2 = caps[157];
        vkCmdWriteTimestamp2 = caps[158];
        vkQueueSubmit2 = caps[159];
        vkCmdCopyBuffer2 = caps[160];
        vkCmdCopyImage2 = caps[161];
        vkCmdCopyBufferToImage2 = caps[162];
        vkCmdCopyImageToBuffer2 = caps[163];
        vkCmdBlitImage2 = caps[164];
        vkCmdResolveImage2 = caps[165];
        vkCmdBeginRendering = caps[166];
        vkCmdEndRendering = caps[167];
        vkCmdSetCullMode = caps[168];
        vkCmdSetFrontFace = caps[169];
        vkCmdSetPrimitiveTopology = caps[170];
        vkCmdSetViewportWithCount = caps[171];
        vkCmdSetScissorWithCount = caps[172];
        vkCmdBindVertexBuffers2 = caps[173];
        vkCmdSetDepthTestEnable = caps[174];
        vkCmdSetDepthWriteEnable = caps[175];
        vkCmdSetDepthCompareOp = caps[176];
        vkCmdSetDepthBoundsTestEnable = caps[177];
        vkCmdSetStencilTestEnable = caps[178];
        vkCmdSetStencilOp = caps[179];
        vkCmdSetRasterizerDiscardEnable = caps[180];
        vkCmdSetDepthBiasEnable = caps[181];
        vkCmdSetPrimitiveRestartEnable = caps[182];
        vkGetDeviceBufferMemoryRequirements = caps[183];
        vkGetDeviceImageMemoryRequirements = caps[184];
        vkGetDeviceImageSparseMemoryRequirements = caps[185];
        vkAntiLagUpdateAMD = caps[186];
        vkCmdWriteBufferMarkerAMD = caps[187];
        vkSetLocalDimmingAMD = caps[188];
        vkCmdDrawIndirectCountAMD = caps[189];
        vkCmdDrawIndexedIndirectCountAMD = caps[190];
        vkGetShaderInfoAMD = caps[191];
        vkCreateExecutionGraphPipelinesAMDX = caps[192];
        vkGetExecutionGraphPipelineScratchSizeAMDX = caps[193];
        vkGetExecutionGraphPipelineNodeIndexAMDX = caps[194];
        vkCmdInitializeGraphScratchMemoryAMDX = caps[195];
        vkCmdDispatchGraphAMDX = caps[196];
        vkCmdDispatchGraphIndirectAMDX = caps[197];
        vkCmdDispatchGraphIndirectCountAMDX = caps[198];
        vkGetAndroidHardwareBufferPropertiesANDROID = caps[199];
        vkGetMemoryAndroidHardwareBufferANDROID = caps[200];
        vkCmdSetAttachmentFeedbackLoopEnableEXT = caps[201];
        vkGetBufferDeviceAddressEXT = caps[202];
        vkGetCalibratedTimestampsEXT = caps[203];
        vkCmdSetColorWriteEnableEXT = caps[204];
        vkCmdBeginConditionalRenderingEXT = caps[205];
        vkCmdEndConditionalRenderingEXT = caps[206];
        vkDebugMarkerSetObjectTagEXT = caps[207];
        vkDebugMarkerSetObjectNameEXT = caps[208];
        vkCmdDebugMarkerBeginEXT = caps[209];
        vkCmdDebugMarkerEndEXT = caps[210];
        vkCmdDebugMarkerInsertEXT = caps[211];
        vkCmdSetDepthBias2EXT = caps[212];
        vkGetDescriptorSetLayoutSizeEXT = caps[213];
        vkGetDescriptorSetLayoutBindingOffsetEXT = caps[214];
        vkGetDescriptorEXT = caps[215];
        vkCmdBindDescriptorBuffersEXT = caps[216];
        vkCmdSetDescriptorBufferOffsetsEXT = caps[217];
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT = caps[218];
        vkGetBufferOpaqueCaptureDescriptorDataEXT = caps[219];
        vkGetImageOpaqueCaptureDescriptorDataEXT = caps[220];
        vkGetImageViewOpaqueCaptureDescriptorDataEXT = caps[221];
        vkGetSamplerOpaqueCaptureDescriptorDataEXT = caps[222];
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = caps[223];
        vkGetDeviceFaultInfoEXT = caps[224];
        vkCmdSetDiscardRectangleEXT = caps[225];
        vkCmdSetDiscardRectangleEnableEXT = caps[226];
        vkCmdSetDiscardRectangleModeEXT = caps[227];
        vkDisplayPowerControlEXT = caps[228];
        vkRegisterDeviceEventEXT = caps[229];
        vkRegisterDisplayEventEXT = caps[230];
        vkGetSwapchainCounterEXT = caps[231];
        vkCmdSetCullModeEXT = caps[232];
        vkCmdSetFrontFaceEXT = caps[233];
        vkCmdSetPrimitiveTopologyEXT = caps[234];
        vkCmdSetViewportWithCountEXT = caps[235];
        vkCmdSetScissorWithCountEXT = caps[236];
        vkCmdBindVertexBuffers2EXT = caps[237];
        vkCmdSetDepthTestEnableEXT = caps[238];
        vkCmdSetDepthWriteEnableEXT = caps[239];
        vkCmdSetDepthCompareOpEXT = caps[240];
        vkCmdSetDepthBoundsTestEnableEXT = caps[241];
        vkCmdSetStencilTestEnableEXT = caps[242];
        vkCmdSetStencilOpEXT = caps[243];
        vkCmdSetPatchControlPointsEXT = caps[244];
        vkCmdSetRasterizerDiscardEnableEXT = caps[245];
        vkCmdSetDepthBiasEnableEXT = caps[246];
        vkCmdSetLogicOpEXT = caps[247];
        vkCmdSetPrimitiveRestartEnableEXT = caps[248];
        vkCmdSetDepthClampEnableEXT = caps[249];
        vkCmdSetPolygonModeEXT = caps[250];
        vkCmdSetRasterizationSamplesEXT = caps[251];
        vkCmdSetSampleMaskEXT = caps[252];
        vkCmdSetAlphaToCoverageEnableEXT = caps[253];
        vkCmdSetAlphaToOneEnableEXT = caps[254];
        vkCmdSetLogicOpEnableEXT = caps[255];
        vkCmdSetColorBlendEnableEXT = caps[256];
        vkCmdSetColorBlendEquationEXT = caps[257];
        vkCmdSetColorWriteMaskEXT = caps[258];
        vkCmdSetTessellationDomainOriginEXT = caps[259];
        vkCmdSetRasterizationStreamEXT = caps[260];
        vkCmdSetConservativeRasterizationModeEXT = caps[261];
        vkCmdSetExtraPrimitiveOverestimationSizeEXT = caps[262];
        vkCmdSetDepthClipEnableEXT = caps[263];
        vkCmdSetSampleLocationsEnableEXT = caps[264];
        vkCmdSetColorBlendAdvancedEXT = caps[265];
        vkCmdSetProvokingVertexModeEXT = caps[266];
        vkCmdSetLineRasterizationModeEXT = caps[267];
        vkCmdSetLineStippleEnableEXT = caps[268];
        vkCmdSetDepthClipNegativeOneToOneEXT = caps[269];
        vkCmdSetViewportWScalingEnableNV = caps[270];
        vkCmdSetViewportSwizzleNV = caps[271];
        vkCmdSetCoverageToColorEnableNV = caps[272];
        vkCmdSetCoverageToColorLocationNV = caps[273];
        vkCmdSetCoverageModulationModeNV = caps[274];
        vkCmdSetCoverageModulationTableEnableNV = caps[275];
        vkCmdSetCoverageModulationTableNV = caps[276];
        vkCmdSetShadingRateImageEnableNV = caps[277];
        vkCmdSetRepresentativeFragmentTestEnableNV = caps[278];
        vkCmdSetCoverageReductionModeNV = caps[279];
        vkGetMemoryHostPointerPropertiesEXT = caps[280];
        vkAcquireFullScreenExclusiveModeEXT = caps[281];
        vkReleaseFullScreenExclusiveModeEXT = caps[282];
        vkGetDeviceGroupSurfacePresentModes2EXT = caps[283];
        vkSetHdrMetadataEXT = caps[284];
        vkCopyMemoryToImageEXT = caps[285];
        vkCopyImageToMemoryEXT = caps[286];
        vkCopyImageToImageEXT = caps[287];
        vkTransitionImageLayoutEXT = caps[288];
        vkGetImageSubresourceLayout2EXT = caps[289];
        vkResetQueryPoolEXT = caps[290];
        vkGetImageDrmFormatModifierPropertiesEXT = caps[291];
        vkCmdSetLineStippleEXT = caps[292];
        vkCmdDrawMeshTasksEXT = caps[293];
        vkCmdDrawMeshTasksIndirectEXT = caps[294];
        vkCmdDrawMeshTasksIndirectCountEXT = caps[295];
        vkExportMetalObjectsEXT = caps[296];
        vkCmdDrawMultiEXT = caps[297];
        vkCmdDrawMultiIndexedEXT = caps[298];
        vkCreateMicromapEXT = caps[299];
        vkDestroyMicromapEXT = caps[300];
        vkCmdBuildMicromapsEXT = caps[301];
        vkBuildMicromapsEXT = caps[302];
        vkCopyMicromapEXT = caps[303];
        vkCopyMicromapToMemoryEXT = caps[304];
        vkCopyMemoryToMicromapEXT = caps[305];
        vkWriteMicromapsPropertiesEXT = caps[306];
        vkCmdCopyMicromapEXT = caps[307];
        vkCmdCopyMicromapToMemoryEXT = caps[308];
        vkCmdCopyMemoryToMicromapEXT = caps[309];
        vkCmdWriteMicromapsPropertiesEXT = caps[310];
        vkGetDeviceMicromapCompatibilityEXT = caps[311];
        vkGetMicromapBuildSizesEXT = caps[312];
        vkSetDeviceMemoryPriorityEXT = caps[313];
        vkGetPipelinePropertiesEXT = caps[314];
        vkCreatePrivateDataSlotEXT = caps[315];
        vkDestroyPrivateDataSlotEXT = caps[316];
        vkSetPrivateDataEXT = caps[317];
        vkGetPrivateDataEXT = caps[318];
        vkCmdSetSampleLocationsEXT = caps[319];
        vkGetShaderModuleIdentifierEXT = caps[320];
        vkGetShaderModuleCreateInfoIdentifierEXT = caps[321];
        vkCreateShadersEXT = caps[322];
        vkDestroyShaderEXT = caps[323];
        vkGetShaderBinaryDataEXT = caps[324];
        vkCmdBindShadersEXT = caps[325];
        vkCmdSetVertexInputEXT = caps[326];
        vkReleaseSwapchainImagesEXT = caps[327];
        vkCmdBindTransformFeedbackBuffersEXT = caps[328];
        vkCmdBeginTransformFeedbackEXT = caps[329];
        vkCmdEndTransformFeedbackEXT = caps[330];
        vkCmdBeginQueryIndexedEXT = caps[331];
        vkCmdEndQueryIndexedEXT = caps[332];
        vkCmdDrawIndirectByteCountEXT = caps[333];
        vkCreateValidationCacheEXT = caps[334];
        vkDestroyValidationCacheEXT = caps[335];
        vkMergeValidationCachesEXT = caps[336];
        vkGetValidationCacheDataEXT = caps[337];
        vkGetRefreshCycleDurationGOOGLE = caps[338];
        vkGetPastPresentationTimingGOOGLE = caps[339];
        vkCmdDrawClusterHUAWEI = caps[340];
        vkCmdDrawClusterIndirectHUAWEI = caps[341];
        vkCmdBindInvocationMaskHUAWEI = caps[342];
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[343];
        vkCmdSubpassShadingHUAWEI = caps[344];
        vkInitializePerformanceApiINTEL = caps[345];
        vkUninitializePerformanceApiINTEL = caps[346];
        vkCmdSetPerformanceMarkerINTEL = caps[347];
        vkCmdSetPerformanceStreamMarkerINTEL = caps[348];
        vkCmdSetPerformanceOverrideINTEL = caps[349];
        vkAcquirePerformanceConfigurationINTEL = caps[350];
        vkReleasePerformanceConfigurationINTEL = caps[351];
        vkQueueSetPerformanceConfigurationINTEL = caps[352];
        vkGetPerformanceParameterINTEL = caps[353];
        vkCreateAccelerationStructureKHR = caps[354];
        vkDestroyAccelerationStructureKHR = caps[355];
        vkCmdBuildAccelerationStructuresKHR = caps[356];
        vkCmdBuildAccelerationStructuresIndirectKHR = caps[357];
        vkBuildAccelerationStructuresKHR = caps[358];
        vkCopyAccelerationStructureKHR = caps[359];
        vkCopyAccelerationStructureToMemoryKHR = caps[360];
        vkCopyMemoryToAccelerationStructureKHR = caps[361];
        vkWriteAccelerationStructuresPropertiesKHR = caps[362];
        vkCmdCopyAccelerationStructureKHR = caps[363];
        vkCmdCopyAccelerationStructureToMemoryKHR = caps[364];
        vkCmdCopyMemoryToAccelerationStructureKHR = caps[365];
        vkGetAccelerationStructureDeviceAddressKHR = caps[366];
        vkCmdWriteAccelerationStructuresPropertiesKHR = caps[367];
        vkGetDeviceAccelerationStructureCompatibilityKHR = caps[368];
        vkGetAccelerationStructureBuildSizesKHR = caps[369];
        vkBindBufferMemory2KHR = caps[370];
        vkBindImageMemory2KHR = caps[371];
        vkGetBufferDeviceAddressKHR = caps[372];
        vkGetBufferOpaqueCaptureAddressKHR = caps[373];
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[374];
        vkGetCalibratedTimestampsKHR = caps[375];
        vkCmdCopyBuffer2KHR = caps[376];
        vkCmdCopyImage2KHR = caps[377];
        vkCmdCopyBufferToImage2KHR = caps[378];
        vkCmdCopyImageToBuffer2KHR = caps[379];
        vkCmdBlitImage2KHR = caps[380];
        vkCmdResolveImage2KHR = caps[381];
        vkCreateRenderPass2KHR = caps[382];
        vkCmdBeginRenderPass2KHR = caps[383];
        vkCmdNextSubpass2KHR = caps[384];
        vkCmdEndRenderPass2KHR = caps[385];
        vkCreateDeferredOperationKHR = caps[386];
        vkDestroyDeferredOperationKHR = caps[387];
        vkGetDeferredOperationMaxConcurrencyKHR = caps[388];
        vkGetDeferredOperationResultKHR = caps[389];
        vkDeferredOperationJoinKHR = caps[390];
        vkCreateDescriptorUpdateTemplateKHR = caps[391];
        vkDestroyDescriptorUpdateTemplateKHR = caps[392];
        vkUpdateDescriptorSetWithTemplateKHR = caps[393];
        vkCmdPushDescriptorSetWithTemplateKHR = caps[394];
        vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[395];
        vkCmdSetDeviceMaskKHR = caps[396];
        vkCmdDispatchBaseKHR = caps[397];
        vkGetDeviceGroupPresentCapabilitiesKHR = caps[398];
        vkGetDeviceGroupSurfacePresentModesKHR = caps[399];
        vkAcquireNextImage2KHR = caps[400];
        vkCreateSharedSwapchainsKHR = caps[401];
        vkCmdDrawIndirectCountKHR = caps[402];
        vkCmdDrawIndexedIndirectCountKHR = caps[403];
        vkCmdBeginRenderingKHR = caps[404];
        vkCmdEndRenderingKHR = caps[405];
        vkCmdSetRenderingAttachmentLocationsKHR = caps[406];
        vkCmdSetRenderingInputAttachmentIndicesKHR = caps[407];
        vkImportFenceFdKHR = caps[408];
        vkGetFenceFdKHR = caps[409];
        vkImportFenceWin32HandleKHR = caps[410];
        vkGetFenceWin32HandleKHR = caps[411];
        vkGetMemoryFdKHR = caps[412];
        vkGetMemoryFdPropertiesKHR = caps[413];
        vkGetMemoryWin32HandleKHR = caps[414];
        vkGetMemoryWin32HandlePropertiesKHR = caps[415];
        vkImportSemaphoreFdKHR = caps[416];
        vkGetSemaphoreFdKHR = caps[417];
        vkImportSemaphoreWin32HandleKHR = caps[418];
        vkGetSemaphoreWin32HandleKHR = caps[419];
        vkCmdSetFragmentShadingRateKHR = caps[420];
        vkGetImageMemoryRequirements2KHR = caps[421];
        vkGetBufferMemoryRequirements2KHR = caps[422];
        vkGetImageSparseMemoryRequirements2KHR = caps[423];
        vkCmdSetLineStippleKHR = caps[424];
        vkTrimCommandPoolKHR = caps[425];
        vkGetDescriptorSetLayoutSupportKHR = caps[426];
        vkGetDeviceBufferMemoryRequirementsKHR = caps[427];
        vkGetDeviceImageMemoryRequirementsKHR = caps[428];
        vkGetDeviceImageSparseMemoryRequirementsKHR = caps[429];
        vkCmdBindIndexBuffer2KHR = caps[430];
        vkGetRenderingAreaGranularityKHR = caps[431];
        vkGetDeviceImageSubresourceLayoutKHR = caps[432];
        vkGetImageSubresourceLayout2KHR = caps[433];
        vkCmdBindDescriptorSets2KHR = caps[434];
        vkCmdPushConstants2KHR = caps[435];
        vkCmdPushDescriptorSet2KHR = caps[436];
        vkCmdPushDescriptorSetWithTemplate2KHR = caps[437];
        vkCmdSetDescriptorBufferOffsets2EXT = caps[438];
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = caps[439];
        vkMapMemory2KHR = caps[440];
        vkUnmapMemory2KHR = caps[441];
        vkAcquireProfilingLockKHR = caps[442];
        vkReleaseProfilingLockKHR = caps[443];
        vkCreatePipelineBinariesKHR = caps[444];
        vkDestroyPipelineBinaryKHR = caps[445];
        vkGetPipelineKeyKHR = caps[446];
        vkGetPipelineBinaryDataKHR = caps[447];
        vkReleaseCapturedPipelineDataKHR = caps[448];
        vkGetPipelineExecutablePropertiesKHR = caps[449];
        vkGetPipelineExecutableStatisticsKHR = caps[450];
        vkGetPipelineExecutableInternalRepresentationsKHR = caps[451];
        vkWaitForPresentKHR = caps[452];
        vkCmdPushDescriptorSetKHR = caps[453];
        vkCmdTraceRaysIndirect2KHR = caps[454];
        vkCmdTraceRaysKHR = caps[455];
        vkCreateRayTracingPipelinesKHR = caps[456];
        vkGetRayTracingShaderGroupHandlesKHR = caps[457];
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[458];
        vkCmdTraceRaysIndirectKHR = caps[459];
        vkGetRayTracingShaderGroupStackSizeKHR = caps[460];
        vkCmdSetRayTracingPipelineStackSizeKHR = caps[461];
        vkCreateSamplerYcbcrConversionKHR = caps[462];
        vkDestroySamplerYcbcrConversionKHR = caps[463];
        vkGetSwapchainStatusKHR = caps[464];
        vkCreateSwapchainKHR = caps[465];
        vkDestroySwapchainKHR = caps[466];
        vkGetSwapchainImagesKHR = caps[467];
        vkAcquireNextImageKHR = caps[468];
        vkQueuePresentKHR = caps[469];
        vkCmdSetEvent2KHR = caps[470];
        vkCmdResetEvent2KHR = caps[471];
        vkCmdWaitEvents2KHR = caps[472];
        vkCmdPipelineBarrier2KHR = caps[473];
        vkCmdWriteTimestamp2KHR = caps[474];
        vkQueueSubmit2KHR = caps[475];
        vkCmdWriteBufferMarker2AMD = caps[476];
        vkGetQueueCheckpointData2NV = caps[477];
        vkGetSemaphoreCounterValueKHR = caps[478];
        vkWaitSemaphoresKHR = caps[479];
        vkSignalSemaphoreKHR = caps[480];
        vkCmdDecodeVideoKHR = caps[481];
        vkGetEncodedVideoSessionParametersKHR = caps[482];
        vkCmdEncodeVideoKHR = caps[483];
        vkCreateVideoSessionKHR = caps[484];
        vkDestroyVideoSessionKHR = caps[485];
        vkGetVideoSessionMemoryRequirementsKHR = caps[486];
        vkBindVideoSessionMemoryKHR = caps[487];
        vkCreateVideoSessionParametersKHR = caps[488];
        vkUpdateVideoSessionParametersKHR = caps[489];
        vkDestroyVideoSessionParametersKHR = caps[490];
        vkCmdBeginVideoCodingKHR = caps[491];
        vkCmdEndVideoCodingKHR = caps[492];
        vkCmdControlVideoCodingKHR = caps[493];
        vkCmdSetViewportWScalingNV = caps[494];
        vkCmdCopyMemoryIndirectNV = caps[495];
        vkCmdCopyMemoryToImageIndirectNV = caps[496];
        vkCreateCudaModuleNV = caps[497];
        vkGetCudaModuleCacheNV = caps[498];
        vkCreateCudaFunctionNV = caps[499];
        vkDestroyCudaModuleNV = caps[500];
        vkDestroyCudaFunctionNV = caps[501];
        vkCmdCudaLaunchKernelNV = caps[502];
        vkCmdSetCheckpointNV = caps[503];
        vkGetQueueCheckpointDataNV = caps[504];
        vkGetGeneratedCommandsMemoryRequirementsNV = caps[505];
        vkCmdPreprocessGeneratedCommandsNV = caps[506];
        vkCmdExecuteGeneratedCommandsNV = caps[507];
        vkCmdBindPipelineShaderGroupNV = caps[508];
        vkCreateIndirectCommandsLayoutNV = caps[509];
        vkDestroyIndirectCommandsLayoutNV = caps[510];
        vkGetPipelineIndirectMemoryRequirementsNV = caps[511];
        vkCmdUpdatePipelineIndirectBufferNV = caps[512];
        vkGetPipelineIndirectDeviceAddressNV = caps[513];
        vkGetMemoryRemoteAddressNV = caps[514];
        vkGetMemoryWin32HandleNV = caps[515];
        vkCmdSetFragmentShadingRateEnumNV = caps[516];
        vkSetLatencySleepModeNV = caps[517];
        vkLatencySleepNV = caps[518];
        vkSetLatencyMarkerNV = caps[519];
        vkGetLatencyTimingsNV = caps[520];
        vkQueueNotifyOutOfBandNV = caps[521];
        vkCmdDecompressMemoryNV = caps[522];
        vkCmdDecompressMemoryIndirectCountNV = caps[523];
        vkCmdDrawMeshTasksNV = caps[524];
        vkCmdDrawMeshTasksIndirectNV = caps[525];
        vkCmdDrawMeshTasksIndirectCountNV = caps[526];
        vkCreateOpticalFlowSessionNV = caps[527];
        vkDestroyOpticalFlowSessionNV = caps[528];
        vkBindOpticalFlowSessionImageNV = caps[529];
        vkCmdOpticalFlowExecuteNV = caps[530];
        vkCreateAccelerationStructureNV = caps[531];
        vkDestroyAccelerationStructureNV = caps[532];
        vkGetAccelerationStructureMemoryRequirementsNV = caps[533];
        vkBindAccelerationStructureMemoryNV = caps[534];
        vkCmdBuildAccelerationStructureNV = caps[535];
        vkCmdCopyAccelerationStructureNV = caps[536];
        vkCmdTraceRaysNV = caps[537];
        vkCreateRayTracingPipelinesNV = caps[538];
        vkGetRayTracingShaderGroupHandlesNV = caps[539];
        vkGetAccelerationStructureHandleNV = caps[540];
        vkCmdWriteAccelerationStructuresPropertiesNV = caps[541];
        vkCompileDeferredNV = caps[542];
        vkCmdSetExclusiveScissorEnableNV = caps[543];
        vkCmdSetExclusiveScissorNV = caps[544];
        vkCmdBindShadingRateImageNV = caps[545];
        vkCmdSetViewportShadingRatePaletteNV = caps[546];
        vkCmdSetCoarseSampleOrderNV = caps[547];
        vkCreateCuModuleNVX = caps[548];
        vkCreateCuFunctionNVX = caps[549];
        vkDestroyCuModuleNVX = caps[550];
        vkDestroyCuFunctionNVX = caps[551];
        vkCmdCuLaunchKernelNVX = caps[552];
        vkGetImageViewHandleNVX = caps[553];
        vkGetImageViewAddressNVX = caps[554];
        vkGetFramebufferTilePropertiesQCOM = caps[555];
        vkGetDynamicRenderingTilePropertiesQCOM = caps[556];
        vkGetDescriptorSetLayoutHostMappingInfoVALVE = caps[557];
        vkGetDescriptorSetHostMappingVALVE = caps[558];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120
        },
            "vkGetDeviceProcAddr", "vkDestroyDevice", "vkGetDeviceQueue", "vkQueueSubmit", "vkQueueWaitIdle", "vkDeviceWaitIdle", "vkAllocateMemory", 
            "vkFreeMemory", "vkMapMemory", "vkUnmapMemory", "vkFlushMappedMemoryRanges", "vkInvalidateMappedMemoryRanges", "vkGetDeviceMemoryCommitment", 
            "vkBindBufferMemory", "vkBindImageMemory", "vkGetBufferMemoryRequirements", "vkGetImageMemoryRequirements", "vkGetImageSparseMemoryRequirements", 
            "vkQueueBindSparse", "vkCreateFence", "vkDestroyFence", "vkResetFences", "vkGetFenceStatus", "vkWaitForFences", "vkCreateSemaphore", 
            "vkDestroySemaphore", "vkCreateEvent", "vkDestroyEvent", "vkGetEventStatus", "vkSetEvent", "vkResetEvent", "vkCreateQueryPool", 
            "vkDestroyQueryPool", "vkGetQueryPoolResults", "vkCreateBuffer", "vkDestroyBuffer", "vkCreateBufferView", "vkDestroyBufferView", "vkCreateImage", 
            "vkDestroyImage", "vkGetImageSubresourceLayout", "vkCreateImageView", "vkDestroyImageView", "vkCreateShaderModule", "vkDestroyShaderModule", 
            "vkCreatePipelineCache", "vkDestroyPipelineCache", "vkGetPipelineCacheData", "vkMergePipelineCaches", "vkCreateGraphicsPipelines", 
            "vkCreateComputePipelines", "vkDestroyPipeline", "vkCreatePipelineLayout", "vkDestroyPipelineLayout", "vkCreateSampler", "vkDestroySampler", 
            "vkCreateDescriptorSetLayout", "vkDestroyDescriptorSetLayout", "vkCreateDescriptorPool", "vkDestroyDescriptorPool", "vkResetDescriptorPool", 
            "vkAllocateDescriptorSets", "vkFreeDescriptorSets", "vkUpdateDescriptorSets", "vkCreateFramebuffer", "vkDestroyFramebuffer", "vkCreateRenderPass", 
            "vkDestroyRenderPass", "vkGetRenderAreaGranularity", "vkCreateCommandPool", "vkDestroyCommandPool", "vkResetCommandPool", 
            "vkAllocateCommandBuffers", "vkFreeCommandBuffers", "vkBeginCommandBuffer", "vkEndCommandBuffer", "vkResetCommandBuffer", "vkCmdBindPipeline", 
            "vkCmdSetViewport", "vkCmdSetScissor", "vkCmdSetLineWidth", "vkCmdSetDepthBias", "vkCmdSetBlendConstants", "vkCmdSetDepthBounds", 
            "vkCmdSetStencilCompareMask", "vkCmdSetStencilWriteMask", "vkCmdSetStencilReference", "vkCmdBindDescriptorSets", "vkCmdBindIndexBuffer", 
            "vkCmdBindVertexBuffers", "vkCmdDraw", "vkCmdDrawIndexed", "vkCmdDrawIndirect", "vkCmdDrawIndexedIndirect", "vkCmdDispatch", 
            "vkCmdDispatchIndirect", "vkCmdCopyBuffer", "vkCmdCopyImage", "vkCmdBlitImage", "vkCmdCopyBufferToImage", "vkCmdCopyImageToBuffer", 
            "vkCmdUpdateBuffer", "vkCmdFillBuffer", "vkCmdClearColorImage", "vkCmdClearDepthStencilImage", "vkCmdClearAttachments", "vkCmdResolveImage", 
            "vkCmdSetEvent", "vkCmdResetEvent", "vkCmdWaitEvents", "vkCmdPipelineBarrier", "vkCmdBeginQuery", "vkCmdEndQuery", "vkCmdResetQueryPool", 
            "vkCmdWriteTimestamp", "vkCmdCopyQueryPoolResults", "vkCmdPushConstants", "vkCmdBeginRenderPass", "vkCmdNextSubpass", "vkCmdEndRenderPass", 
            "vkCmdExecuteCommands"
        ) || reportMissing("VK", "Vulkan10");
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136
        },
            "vkBindBufferMemory2", "vkBindImageMemory2", "vkGetDeviceGroupPeerMemoryFeatures", "vkCmdSetDeviceMask", "vkCmdDispatchBase", 
            "vkGetImageMemoryRequirements2", "vkGetBufferMemoryRequirements2", "vkGetImageSparseMemoryRequirements2", "vkTrimCommandPool", "vkGetDeviceQueue2", 
            "vkCreateSamplerYcbcrConversion", "vkDestroySamplerYcbcrConversion", "vkCreateDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplate", 
            "vkUpdateDescriptorSetWithTemplate", "vkGetDescriptorSetLayoutSupport"
        ) || reportMissing("VK", "Vulkan11");
    }

    private static boolean check_VK12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan12")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149
        },
            "vkCmdDrawIndirectCount", "vkCmdDrawIndexedIndirectCount", "vkCreateRenderPass2", "vkCmdBeginRenderPass2", "vkCmdNextSubpass2", 
            "vkCmdEndRenderPass2", "vkResetQueryPool", "vkGetSemaphoreCounterValue", "vkWaitSemaphores", "vkSignalSemaphore", "vkGetBufferDeviceAddress", 
            "vkGetBufferOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddress"
        ) || reportMissing("VK", "Vulkan12");
    }

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan13")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 
            179, 180, 181, 182, 183, 184, 185
        },
            "vkCreatePrivateDataSlot", "vkDestroyPrivateDataSlot", "vkSetPrivateData", "vkGetPrivateData", "vkCmdSetEvent2", "vkCmdResetEvent2", 
            "vkCmdWaitEvents2", "vkCmdPipelineBarrier2", "vkCmdWriteTimestamp2", "vkQueueSubmit2", "vkCmdCopyBuffer2", "vkCmdCopyImage2", 
            "vkCmdCopyBufferToImage2", "vkCmdCopyImageToBuffer2", "vkCmdBlitImage2", "vkCmdResolveImage2", "vkCmdBeginRendering", "vkCmdEndRendering", 
            "vkCmdSetCullMode", "vkCmdSetFrontFace", "vkCmdSetPrimitiveTopology", "vkCmdSetViewportWithCount", "vkCmdSetScissorWithCount", 
            "vkCmdBindVertexBuffers2", "vkCmdSetDepthTestEnable", "vkCmdSetDepthWriteEnable", "vkCmdSetDepthCompareOp", "vkCmdSetDepthBoundsTestEnable", 
            "vkCmdSetStencilTestEnable", "vkCmdSetStencilOp", "vkCmdSetRasterizerDiscardEnable", "vkCmdSetDepthBiasEnable", "vkCmdSetPrimitiveRestartEnable", 
            "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirements"
        ) || reportMissing("VK", "Vulkan13");
    }

    private static boolean check_AMD_anti_lag(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_anti_lag")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            186
        },
            "vkAntiLagUpdateAMD"
        ) || reportMissing("VK", "VK_AMD_anti_lag");
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_buffer_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            187
        },
            "vkCmdWriteBufferMarkerAMD"
        ) || reportMissing("VK", "VK_AMD_buffer_marker");
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_display_native_hdr")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            188
        },
            "vkSetLocalDimmingAMD"
        ) || reportMissing("VK", "VK_AMD_display_native_hdr");
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            189, 190
        },
            "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD"
        ) || reportMissing("VK", "VK_AMD_draw_indirect_count");
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_shader_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            191
        },
            "vkGetShaderInfoAMD"
        ) || reportMissing("VK", "VK_AMD_shader_info");
    }

    private static boolean check_AMDX_shader_enqueue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMDX_shader_enqueue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            192, 193, 194, 195, 196, 197, 198
        },
            "vkCreateExecutionGraphPipelinesAMDX", "vkGetExecutionGraphPipelineScratchSizeAMDX", "vkGetExecutionGraphPipelineNodeIndexAMDX", 
            "vkCmdInitializeGraphScratchMemoryAMDX", "vkCmdDispatchGraphAMDX", "vkCmdDispatchGraphIndirectAMDX", "vkCmdDispatchGraphIndirectCountAMDX"
        ) || reportMissing("VK", "VK_AMDX_shader_enqueue");
    }

    private static boolean check_ANDROID_external_memory_android_hardware_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ANDROID_external_memory_android_hardware_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            199, 200
        },
            "vkGetAndroidHardwareBufferPropertiesANDROID", "vkGetMemoryAndroidHardwareBufferANDROID"
        ) || reportMissing("VK", "VK_ANDROID_external_memory_android_hardware_buffer");
    }

    private static boolean check_EXT_attachment_feedback_loop_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_attachment_feedback_loop_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            201
        },
            "vkCmdSetAttachmentFeedbackLoopEnableEXT"
        ) || reportMissing("VK", "VK_EXT_attachment_feedback_loop_dynamic_state");
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            202
        },
            "vkGetBufferDeviceAddressEXT"
        ) || reportMissing("VK", "VK_EXT_buffer_device_address");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            203
        },
            "vkGetCalibratedTimestampsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_color_write_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            204
        },
            "vkCmdSetColorWriteEnableEXT"
        ) || reportMissing("VK", "VK_EXT_color_write_enable");
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_conditional_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205, 206
        },
            "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT"
        ) || reportMissing("VK", "VK_EXT_conditional_rendering");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            207, 208, 209, 210, 211
        },
            "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT"
        ) || reportMissing("VK", "VK_EXT_debug_marker");
    }

    private static boolean check_EXT_depth_bias_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_depth_bias_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            212
        },
            "vkCmdSetDepthBias2EXT"
        ) || reportMissing("VK", "VK_EXT_depth_bias_control");
    }

    private static boolean check_EXT_descriptor_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_descriptor_buffer")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_acceleration_structure") || ext.contains("VK_NV_ray_tracing") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            213, 214, 215, 216, 217, 218, 219, 220, 221, 222, flag0 + 223
        },
            "vkGetDescriptorSetLayoutSizeEXT", "vkGetDescriptorSetLayoutBindingOffsetEXT", "vkGetDescriptorEXT", "vkCmdBindDescriptorBuffersEXT", 
            "vkCmdSetDescriptorBufferOffsetsEXT", "vkCmdBindDescriptorBufferEmbeddedSamplersEXT", "vkGetBufferOpaqueCaptureDescriptorDataEXT", 
            "vkGetImageOpaqueCaptureDescriptorDataEXT", "vkGetImageViewOpaqueCaptureDescriptorDataEXT", "vkGetSamplerOpaqueCaptureDescriptorDataEXT", 
            "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT"
        ) || reportMissing("VK", "VK_EXT_descriptor_buffer");
    }

    private static boolean check_EXT_device_fault(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_fault")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            224
        },
            "vkGetDeviceFaultInfoEXT"
        ) || reportMissing("VK", "VK_EXT_device_fault");
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_discard_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            225, 226, 227
        },
            "vkCmdSetDiscardRectangleEXT", "vkCmdSetDiscardRectangleEnableEXT", "vkCmdSetDiscardRectangleModeEXT"
        ) || reportMissing("VK", "VK_EXT_discard_rectangles");
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            228, 229, 230, 231
        },
            "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT"
        ) || reportMissing("VK", "VK_EXT_display_control");
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243
        },
            "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", 
            "vkCmdBindVertexBuffers2EXT", "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", 
            "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state");
    }

    private static boolean check_EXT_extended_dynamic_state2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            244, 245, 246, 247, 248
        },
            "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", 
            "vkCmdSetPrimitiveRestartEnableEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state2");
    }

    private static boolean check_EXT_extended_dynamic_state3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state3")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_maintenance2") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag13 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag15 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            249, 250, 251, 252, 253, 254, 255, 256, 257, 258, flag0 + 259, flag1 + 260, flag2 + 261, flag2 + 262, flag4 + 263, flag5 + 264, flag6 + 265, 
            flag7 + 266, flag8 + 267, flag8 + 268, flag10 + 269, flag11 + 270, flag12 + 271, flag13 + 272, flag13 + 273, flag15 + 274, flag15 + 275, 
            flag15 + 276, flag18 + 277, flag19 + 278, flag20 + 279
        },
            "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", "vkCmdSetSampleMaskEXT", 
            "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", "vkCmdSetColorBlendEnableEXT", 
            "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state3");
    }

    private static boolean check_EXT_external_memory_host(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_host")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            280
        },
            "vkGetMemoryHostPointerPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_host");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            281, 282, flag0 + 283
        },
            "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_hdr_metadata")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            284
        },
            "vkSetHdrMetadataEXT"
        ) || reportMissing("VK", "VK_EXT_hdr_metadata");
    }

    private static boolean check_EXT_host_image_copy(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_image_copy")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            285, 286, 287, 288, 289
        },
            "vkCopyMemoryToImageEXT", "vkCopyImageToMemoryEXT", "vkCopyImageToImageEXT", "vkTransitionImageLayoutEXT", "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_host_image_copy");
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_query_reset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            290
        },
            "vkResetQueryPoolEXT"
        ) || reportMissing("VK", "VK_EXT_host_query_reset");
    }

    private static boolean check_EXT_image_compression_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_compression_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            289
        },
            "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_image_compression_control");
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_drm_format_modifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            291
        },
            "vkGetImageDrmFormatModifierPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_image_drm_format_modifier");
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            292
        },
            "vkCmdSetLineStippleEXT"
        ) || reportMissing("VK", "VK_EXT_line_rasterization");
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            293, 294, 295
        },
            "vkCmdDrawMeshTasksEXT", "vkCmdDrawMeshTasksIndirectEXT", "vkCmdDrawMeshTasksIndirectCountEXT"
        ) || reportMissing("VK", "VK_EXT_mesh_shader");
    }

    private static boolean check_EXT_metal_objects(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_objects")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            296
        },
            "vkExportMetalObjectsEXT"
        ) || reportMissing("VK", "VK_EXT_metal_objects");
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_multi_draw")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            297, 298
        },
            "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT"
        ) || reportMissing("VK", "VK_EXT_multi_draw");
    }

    private static boolean check_EXT_opacity_micromap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_opacity_micromap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312
        },
            "vkCreateMicromapEXT", "vkDestroyMicromapEXT", "vkCmdBuildMicromapsEXT", "vkBuildMicromapsEXT", "vkCopyMicromapEXT", "vkCopyMicromapToMemoryEXT", 
            "vkCopyMemoryToMicromapEXT", "vkWriteMicromapsPropertiesEXT", "vkCmdCopyMicromapEXT", "vkCmdCopyMicromapToMemoryEXT", 
            "vkCmdCopyMemoryToMicromapEXT", "vkCmdWriteMicromapsPropertiesEXT", "vkGetDeviceMicromapCompatibilityEXT", "vkGetMicromapBuildSizesEXT"
        ) || reportMissing("VK", "VK_EXT_opacity_micromap");
    }

    private static boolean check_EXT_pageable_device_local_memory(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pageable_device_local_memory")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            313
        },
            "vkSetDeviceMemoryPriorityEXT"
        ) || reportMissing("VK", "VK_EXT_pageable_device_local_memory");
    }

    private static boolean check_EXT_pipeline_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pipeline_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            314
        },
            "vkGetPipelinePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_pipeline_properties");
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_private_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            315, 316, 317, 318
        },
            "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT"
        ) || reportMissing("VK", "VK_EXT_private_data");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            319
        },
            "vkCmdSetSampleLocationsEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_shader_module_identifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_module_identifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            320, 321
        },
            "vkGetShaderModuleIdentifierEXT", "vkGetShaderModuleCreateInfoIdentifierEXT"
        ) || reportMissing("VK", "VK_EXT_shader_module_identifier");
    }

    private static boolean check_EXT_shader_object(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_object")) {
            return false;
        }

        int flag0 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag14 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag17 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            322, 323, 324, 325, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 326, 244, 245, 246, 247, 248, 259, 249, 250, 251, 252, 253, 254, 
            255, 256, 257, 258, flag0 + 260, flag1 + 261, flag1 + 262, flag3 + 263, flag4 + 264, flag5 + 265, flag6 + 266, flag7 + 267, flag7 + 268, 
            flag9 + 269, flag10 + 270, flag11 + 271, flag12 + 272, flag12 + 273, flag14 + 274, flag14 + 275, flag14 + 276, flag17 + 277, flag18 + 278, 
            flag19 + 279
        },
            "vkCreateShadersEXT", "vkDestroyShaderEXT", "vkGetShaderBinaryDataEXT", "vkCmdBindShadersEXT", "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", 
            "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", "vkCmdBindVertexBuffers2EXT", 
            "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthBoundsTestEnableEXT", 
            "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT", "vkCmdSetVertexInputEXT", "vkCmdSetPatchControlPointsEXT", 
            "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", "vkCmdSetPrimitiveRestartEnableEXT", 
            "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", 
            "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", 
            "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV"
        ) || reportMissing("VK", "VK_EXT_shader_object");
    }

    private static boolean check_EXT_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_swapchain_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            327
        },
            "vkReleaseSwapchainImagesEXT"
        ) || reportMissing("VK", "VK_EXT_swapchain_maintenance1");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            328, 329, 330, 331, 332, 333
        },
            "vkCmdBindTransformFeedbackBuffersEXT", "vkCmdBeginTransformFeedbackEXT", "vkCmdEndTransformFeedbackEXT", "vkCmdBeginQueryIndexedEXT", 
            "vkCmdEndQueryIndexedEXT", "vkCmdDrawIndirectByteCountEXT"
        ) || reportMissing("VK", "VK_EXT_transform_feedback");
    }

    private static boolean check_EXT_validation_cache(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_validation_cache")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            334, 335, 336, 337
        },
            "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT"
        ) || reportMissing("VK", "VK_EXT_validation_cache");
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_vertex_input_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            326
        },
            "vkCmdSetVertexInputEXT"
        ) || reportMissing("VK", "VK_EXT_vertex_input_dynamic_state");
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_GOOGLE_display_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            338, 339
        },
            "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE"
        ) || reportMissing("VK", "VK_GOOGLE_display_timing");
    }

    private static boolean check_HUAWEI_cluster_culling_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_cluster_culling_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            340, 341
        },
            "vkCmdDrawClusterHUAWEI", "vkCmdDrawClusterIndirectHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_cluster_culling_shader");
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_invocation_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            342
        },
            "vkCmdBindInvocationMaskHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_invocation_mask");
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_subpass_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            343, 344
        },
            "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_subpass_shading");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            345, 346, 347, 348, 349, 350, 351, 352, 353
        },
            "vkInitializePerformanceApiINTEL", "vkUninitializePerformanceApiINTEL", "vkCmdSetPerformanceMarkerINTEL", "vkCmdSetPerformanceStreamMarkerINTEL", 
            "vkCmdSetPerformanceOverrideINTEL", "vkAcquirePerformanceConfigurationINTEL", "vkReleasePerformanceConfigurationINTEL", 
            "vkQueueSetPerformanceConfigurationINTEL", "vkGetPerformanceParameterINTEL"
        ) || reportMissing("VK", "VK_INTEL_performance_query");
    }

    private static boolean check_KHR_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369
        },
            "vkCreateAccelerationStructureKHR", "vkDestroyAccelerationStructureKHR", "vkCmdBuildAccelerationStructuresKHR", 
            "vkCmdBuildAccelerationStructuresIndirectKHR", "vkBuildAccelerationStructuresKHR", "vkCopyAccelerationStructureKHR", 
            "vkCopyAccelerationStructureToMemoryKHR", "vkCopyMemoryToAccelerationStructureKHR", "vkWriteAccelerationStructuresPropertiesKHR", 
            "vkCmdCopyAccelerationStructureKHR", "vkCmdCopyAccelerationStructureToMemoryKHR", "vkCmdCopyMemoryToAccelerationStructureKHR", 
            "vkGetAccelerationStructureDeviceAddressKHR", "vkCmdWriteAccelerationStructuresPropertiesKHR", "vkGetDeviceAccelerationStructureCompatibilityKHR", 
            "vkGetAccelerationStructureBuildSizesKHR"
        ) || reportMissing("VK", "VK_KHR_acceleration_structure");
    }

    private static boolean check_KHR_bind_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_bind_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            370, 371
        },
            "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_bind_memory2");
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            372, 373, 374
        },
            "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
        ) || reportMissing("VK", "VK_KHR_buffer_device_address");
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            375
        },
            "vkGetCalibratedTimestampsKHR"
        ) || reportMissing("VK", "VK_KHR_calibrated_timestamps");
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_commands2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            376, 377, 378, 379, 380, 381
        },
            "vkCmdCopyBuffer2KHR", "vkCmdCopyImage2KHR", "vkCmdCopyBufferToImage2KHR", "vkCmdCopyImageToBuffer2KHR", "vkCmdBlitImage2KHR", 
            "vkCmdResolveImage2KHR"
        ) || reportMissing("VK", "VK_KHR_copy_commands2");
    }

    private static boolean check_KHR_create_renderpass2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_create_renderpass2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            382, 383, 384, 385
        },
            "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR"
        ) || reportMissing("VK", "VK_KHR_create_renderpass2");
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_deferred_host_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            386, 387, 388, 389, 390
        },
            "vkCreateDeferredOperationKHR", "vkDestroyDeferredOperationKHR", "vkGetDeferredOperationMaxConcurrencyKHR", "vkGetDeferredOperationResultKHR", 
            "vkDeferredOperationJoinKHR"
        ) || reportMissing("VK", "VK_KHR_deferred_host_operations");
    }

    private static boolean check_KHR_descriptor_update_template(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_descriptor_update_template")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            391, 392, 393, flag0 + 394
        },
            "vkCreateDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplateKHR", "vkUpdateDescriptorSetWithTemplateKHR", 
            "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_descriptor_update_template");
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_surface") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_KHR_swapchain") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            395, 396, 397, flag0 + 398, flag0 + 399, flag2 + 400
        },
            "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkCmdSetDeviceMaskKHR", "vkCmdDispatchBaseKHR", "vkGetDeviceGroupPresentCapabilitiesKHR", 
            "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_device_group");
    }

    private static boolean check_KHR_display_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_display_swapchain")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            401
        },
            "vkCreateSharedSwapchainsKHR"
        ) || reportMissing("VK", "VK_KHR_display_swapchain");
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            402, 403
        },
            "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR"
        ) || reportMissing("VK", "VK_KHR_draw_indirect_count");
    }

    private static boolean check_KHR_dynamic_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            404, 405
        },
            "vkCmdBeginRenderingKHR", "vkCmdEndRenderingKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering");
    }

    private static boolean check_KHR_dynamic_rendering_local_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering_local_read")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            406, 407
        },
            "vkCmdSetRenderingAttachmentLocationsKHR", "vkCmdSetRenderingInputAttachmentIndicesKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering_local_read");
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            408, 409
        },
            "vkImportFenceFdKHR", "vkGetFenceFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_fd");
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            410, 411
        },
            "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_win32");
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            412, 413
        },
            "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_fd");
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            414, 415
        },
            "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_win32");
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            416, 417
        },
            "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_fd");
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            418, 419
        },
            "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_win32");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            420
        },
            "vkCmdSetFragmentShadingRateKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_memory_requirements2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            421, 422, 423
        },
            "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR"
        ) || reportMissing("VK", "VK_KHR_get_memory_requirements2");
    }

    private static boolean check_KHR_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            424
        },
            "vkCmdSetLineStippleKHR"
        ) || reportMissing("VK", "VK_KHR_line_rasterization");
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            425
        },
            "vkTrimCommandPoolKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance1");
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            426
        },
            "vkGetDescriptorSetLayoutSupportKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance3");
    }

    private static boolean check_KHR_maintenance4(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance4")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            427, 428, 429
        },
            "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirementsKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance4");
    }

    private static boolean check_KHR_maintenance5(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance5")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            430, 431, 432, 433
        },
            "vkCmdBindIndexBuffer2KHR", "vkGetRenderingAreaGranularityKHR", "vkGetDeviceImageSubresourceLayoutKHR", "vkGetImageSubresourceLayout2KHR"
        ) || reportMissing("VK", "VK_KHR_maintenance5");
    }

    private static boolean check_KHR_maintenance6(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance6")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_descriptor_buffer") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            434, 435, flag0 + 436, flag0 + 437, flag2 + 438, flag2 + 439
        },
            "vkCmdBindDescriptorSets2KHR", "vkCmdPushConstants2KHR", "vkCmdPushDescriptorSet2KHR", "vkCmdPushDescriptorSetWithTemplate2KHR", 
            "vkCmdSetDescriptorBufferOffsets2EXT", "vkCmdBindDescriptorBufferEmbeddedSamplers2EXT"
        ) || reportMissing("VK", "VK_KHR_maintenance6");
    }

    private static boolean check_KHR_map_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_map_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            440, 441
        },
            "vkMapMemory2KHR", "vkUnmapMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_map_memory2");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            442, 443
        },
            "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_pipeline_binary(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_binary")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            444, 445, 446, 447, 448
        },
            "vkCreatePipelineBinariesKHR", "vkDestroyPipelineBinaryKHR", "vkGetPipelineKeyKHR", "vkGetPipelineBinaryDataKHR", 
            "vkReleaseCapturedPipelineDataKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_binary");
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_executable_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            449, 450, 451
        },
            "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_executable_properties");
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            452
        },
            "vkWaitForPresentKHR"
        ) || reportMissing("VK", "VK_KHR_present_wait");
    }

    private static boolean check_KHR_push_descriptor(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_push_descriptor")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            453, flag0 + 394
        },
            "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_push_descriptor");
    }

    private static boolean check_KHR_ray_tracing_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_maintenance1")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_ray_tracing_pipeline") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 454
        },
            "vkCmdTraceRaysIndirect2KHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_maintenance1");
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_pipeline")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            455, 456, 457, 458, 459, 460, 461
        },
            "vkCmdTraceRaysKHR", "vkCreateRayTracingPipelinesKHR", "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", 
            "vkCmdTraceRaysIndirectKHR", "vkGetRayTracingShaderGroupStackSizeKHR", "vkCmdSetRayTracingPipelineStackSizeKHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_pipeline");
    }

    private static boolean check_KHR_sampler_ycbcr_conversion(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_sampler_ycbcr_conversion")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            462, 463
        },
            "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR"
        ) || reportMissing("VK", "VK_KHR_sampler_ycbcr_conversion");
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_shared_presentable_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            464
        },
            "vkGetSwapchainStatusKHR"
        ) || reportMissing("VK", "VK_KHR_shared_presentable_image");
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_swapchain")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            465, 466, 467, 468, 469, flag0 + 398, flag0 + 399, flag0 + 400
        },
            "vkCreateSwapchainKHR", "vkDestroySwapchainKHR", "vkGetSwapchainImagesKHR", "vkAcquireNextImageKHR", "vkQueuePresentKHR", 
            "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_synchronization2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_synchronization2")) {
            return false;
        }

        int flag0 = ext.contains("VK_AMD_buffer_marker") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_NV_device_diagnostic_checkpoints") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            470, 471, 472, 473, 474, 475, flag0 + 476, flag1 + 477
        },
            "vkCmdSetEvent2KHR", "vkCmdResetEvent2KHR", "vkCmdWaitEvents2KHR", "vkCmdPipelineBarrier2KHR", "vkCmdWriteTimestamp2KHR", "vkQueueSubmit2KHR", 
            "vkCmdWriteBufferMarker2AMD", "vkGetQueueCheckpointData2NV"
        ) || reportMissing("VK", "VK_KHR_synchronization2");
    }

    private static boolean check_KHR_timeline_semaphore(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_timeline_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            478, 479, 480
        },
            "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR"
        ) || reportMissing("VK", "VK_KHR_timeline_semaphore");
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_decode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            481
        },
            "vkCmdDecodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_decode_queue");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            482, 483
        },
            "vkGetEncodedVideoSessionParametersKHR", "vkCmdEncodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            484, 485, 486, 487, 488, 489, 490, 491, 492, 493
        },
            "vkCreateVideoSessionKHR", "vkDestroyVideoSessionKHR", "vkGetVideoSessionMemoryRequirementsKHR", "vkBindVideoSessionMemoryKHR", 
            "vkCreateVideoSessionParametersKHR", "vkUpdateVideoSessionParametersKHR", "vkDestroyVideoSessionParametersKHR", "vkCmdBeginVideoCodingKHR", 
            "vkCmdEndVideoCodingKHR", "vkCmdControlVideoCodingKHR"
        ) || reportMissing("VK", "VK_KHR_video_queue");
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_clip_space_w_scaling")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            494
        },
            "vkCmdSetViewportWScalingNV"
        ) || reportMissing("VK", "VK_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_copy_memory_indirect")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            495, 496
        },
            "vkCmdCopyMemoryIndirectNV", "vkCmdCopyMemoryToImageIndirectNV"
        ) || reportMissing("VK", "VK_NV_copy_memory_indirect");
    }

    private static boolean check_NV_cuda_kernel_launch(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cuda_kernel_launch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            497, 498, 499, 500, 501, 502
        },
            "vkCreateCudaModuleNV", "vkGetCudaModuleCacheNV", "vkCreateCudaFunctionNV", "vkDestroyCudaModuleNV", "vkDestroyCudaFunctionNV", 
            "vkCmdCudaLaunchKernelNV"
        ) || reportMissing("VK", "VK_NV_cuda_kernel_launch");
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_diagnostic_checkpoints")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            503, 504
        },
            "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV"
        ) || reportMissing("VK", "VK_NV_device_diagnostic_checkpoints");
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            505, 506, 507, 508, 509, 510
        },
            "vkGetGeneratedCommandsMemoryRequirementsNV", "vkCmdPreprocessGeneratedCommandsNV", "vkCmdExecuteGeneratedCommandsNV", 
            "vkCmdBindPipelineShaderGroupNV", "vkCreateIndirectCommandsLayoutNV", "vkDestroyIndirectCommandsLayoutNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands");
    }

    private static boolean check_NV_device_generated_commands_compute(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands_compute")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            511, 512, 513
        },
            "vkGetPipelineIndirectMemoryRequirementsNV", "vkCmdUpdatePipelineIndirectBufferNV", "vkGetPipelineIndirectDeviceAddressNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands_compute");
    }

    private static boolean check_NV_external_memory_rdma(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_rdma")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            514
        },
            "vkGetMemoryRemoteAddressNV"
        ) || reportMissing("VK", "VK_NV_external_memory_rdma");
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            515
        },
            "vkGetMemoryWin32HandleNV"
        ) || reportMissing("VK", "VK_NV_external_memory_win32");
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_fragment_shading_rate_enums")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            516
        },
            "vkCmdSetFragmentShadingRateEnumNV"
        ) || reportMissing("VK", "VK_NV_fragment_shading_rate_enums");
    }

    private static boolean check_NV_low_latency2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_low_latency2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            517, 518, 519, 520, 521
        },
            "vkSetLatencySleepModeNV", "vkLatencySleepNV", "vkSetLatencyMarkerNV", "vkGetLatencyTimingsNV", "vkQueueNotifyOutOfBandNV"
        ) || reportMissing("VK", "VK_NV_low_latency2");
    }

    private static boolean check_NV_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_memory_decompression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            522, 523
        },
            "vkCmdDecompressMemoryNV", "vkCmdDecompressMemoryIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_memory_decompression");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            524, 525, 526
        },
            "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_mesh_shader");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            527, 528, 529, 530
        },
            "vkCreateOpticalFlowSessionNV", "vkDestroyOpticalFlowSessionNV", "vkBindOpticalFlowSessionImageNV", "vkCmdOpticalFlowExecuteNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_ray_tracing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542
        },
            "vkCreateAccelerationStructureNV", "vkDestroyAccelerationStructureNV", "vkGetAccelerationStructureMemoryRequirementsNV", 
            "vkBindAccelerationStructureMemoryNV", "vkCmdBuildAccelerationStructureNV", "vkCmdCopyAccelerationStructureNV", "vkCmdTraceRaysNV", 
            "vkCreateRayTracingPipelinesNV", "vkGetRayTracingShaderGroupHandlesNV", "vkGetAccelerationStructureHandleNV", 
            "vkCmdWriteAccelerationStructuresPropertiesNV", "vkCompileDeferredNV"
        ) || reportMissing("VK", "VK_NV_ray_tracing");
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_scissor_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            543, 544
        },
            "vkCmdSetExclusiveScissorEnableNV", "vkCmdSetExclusiveScissorNV"
        ) || reportMissing("VK", "VK_NV_scissor_exclusive");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_shading_rate_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            545, 546, 547
        },
            "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV"
        ) || reportMissing("VK", "VK_NV_shading_rate_image");
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_binary_import")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            548, 549, 550, 551, 552
        },
            "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX"
        ) || reportMissing("VK", "VK_NVX_binary_import");
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_image_view_handle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            553, 554
        },
            "vkGetImageViewHandleNVX", "vkGetImageViewAddressNVX"
        ) || reportMissing("VK", "VK_NVX_image_view_handle");
    }

    private static boolean check_QCOM_tile_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            555, 556
        },
            "vkGetFramebufferTilePropertiesQCOM", "vkGetDynamicRenderingTilePropertiesQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_properties");
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_VALVE_descriptor_set_host_mapping")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            557, 558
        },
            "vkGetDescriptorSetLayoutHostMappingInfoVALVE", "vkGetDescriptorSetHostMappingVALVE"
        ) || reportMissing("VK", "VK_VALVE_descriptor_set_host_mapping");
    }

}
