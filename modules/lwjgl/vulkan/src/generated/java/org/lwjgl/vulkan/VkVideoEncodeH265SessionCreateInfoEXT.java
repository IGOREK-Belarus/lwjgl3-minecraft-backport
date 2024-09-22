/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.265 encode session parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useMaxLevelIdc};
 *     StdVideoH265LevelIdc {@link #maxLevelIdc};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionCreateInfoEXT extends Struct<VkVideoEncodeH265SessionCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEMAXLEVELIDC,
        MAXLEVELIDC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMAXLEVELIDC = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
    }

    protected VkVideoEncodeH265SessionCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the value of {@code maxLevelIdc} should be used by the implementation. When it is set to {@link VK10#VK_FALSE FALSE}, the implementation ignores the value of {@code maxLevelIdc} and uses the value of {@link VkVideoEncodeH265CapabilitiesEXT}{@code ::maxLevelIdc}, as reported by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile. */
    @NativeType("VkBool32")
    public boolean useMaxLevelIdc() { return nuseMaxLevelIdc(address()) != 0; }
    /** provides the upper bound on the H.265 level for the video bitstreams produced by the created video session. */
    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useMaxLevelIdc} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT useMaxLevelIdc(@NativeType("VkBool32") boolean value) { nuseMaxLevelIdc(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maxLevelIdc} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT maxLevelIdc(@NativeType("StdVideoH265LevelIdc") int value) { nmaxLevelIdc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionCreateInfoEXT set(
        int sType,
        long pNext,
        boolean useMaxLevelIdc,
        int maxLevelIdc
    ) {
        sType(sType);
        pNext(pNext);
        useMaxLevelIdc(useMaxLevelIdc);
        maxLevelIdc(maxLevelIdc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265SessionCreateInfoEXT set(VkVideoEncodeH265SessionCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionCreateInfoEXT malloc() {
        return new VkVideoEncodeH265SessionCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionCreateInfoEXT calloc() {
        return new VkVideoEncodeH265SessionCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionCreateInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #useMaxLevelIdc}. */
    public static int nuseMaxLevelIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.USEMAXLEVELIDC); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.MAXLEVELIDC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #useMaxLevelIdc(boolean) useMaxLevelIdc}. */
    public static void nuseMaxLevelIdc(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.USEMAXLEVELIDC, value); }
    /** Unsafe version of {@link #maxLevelIdc(int) maxLevelIdc}. */
    public static void nmaxLevelIdc(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.MAXLEVELIDC, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoEncodeH265SessionCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#useMaxLevelIdc} field. */
        @NativeType("VkBool32")
        public boolean useMaxLevelIdc() { return VkVideoEncodeH265SessionCreateInfoEXT.nuseMaxLevelIdc(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#maxLevelIdc} field. */
        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH265SessionCreateInfoEXT.nmaxLevelIdc(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT} value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#useMaxLevelIdc} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer useMaxLevelIdc(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionCreateInfoEXT.nuseMaxLevelIdc(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#maxLevelIdc} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer maxLevelIdc(@NativeType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265SessionCreateInfoEXT.nmaxLevelIdc(address(), value); return this; }

    }

}