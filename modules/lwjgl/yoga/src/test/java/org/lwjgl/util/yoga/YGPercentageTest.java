/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.*;

@SuppressWarnings("MisorderedAssertEqualsArgumentsTestNG")
public class YGPercentageTest {
    @Test
    public void test_percentage_width_height() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setWidthPercent(30f);
        root_child0.setHeightPercent(30f);
        root.addChildAt(root_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(140f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_position_left_top() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(400f);
        root.setHeight(400f);

        YogaNode root_child0 = createNode(config);
        root_child0.setPositionPercent(YogaEdge.LEFT, 10f);
        root_child0.setPositionPercent(YogaEdge.TOP, 20f);
        root_child0.setWidthPercent(45f);
        root_child0.setHeightPercent(55f);
        root.addChildAt(root_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(400f, root.getLayoutWidth(), 0.0f);
        assertEquals(400f, root.getLayoutHeight(), 0.0f);

        assertEquals(40f, root_child0.getLayoutX(), 0.0f);
        assertEquals(80f, root_child0.getLayoutY(), 0.0f);
        assertEquals(180f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(220f, root_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(400f, root.getLayoutWidth(), 0.0f);
        assertEquals(400f, root.getLayoutHeight(), 0.0f);

        assertEquals(260f, root_child0.getLayoutX(), 0.0f);
        assertEquals(80f, root_child0.getLayoutY(), 0.0f);
        assertEquals(180f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(220f, root_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_position_bottom_right() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(500f);
        root.setHeight(500f);

        YogaNode root_child0 = createNode(config);
        root_child0.setPositionPercent(YogaEdge.RIGHT, 20f);
        root_child0.setPositionPercent(YogaEdge.BOTTOM, 10f);
        root_child0.setWidthPercent(55f);
        root_child0.setHeightPercent(15f);
        root.addChildAt(root_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(500f, root.getLayoutWidth(), 0.0f);
        assertEquals(500f, root.getLayoutHeight(), 0.0f);

        assertEquals(-100f, root_child0.getLayoutX(), 0.0f);
        assertEquals(-50f, root_child0.getLayoutY(), 0.0f);
        assertEquals(275f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(500f, root.getLayoutWidth(), 0.0f);
        assertEquals(500f, root.getLayoutHeight(), 0.0f);

        assertEquals(125f, root_child0.getLayoutX(), 0.0f);
        assertEquals(-50f, root_child0.getLayoutY(), 0.0f);
        assertEquals(275f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(50f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setFlexBasisPercent(25f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(125f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(125f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(75f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(75f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(125f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(75f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_cross() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(50f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setFlexBasisPercent(25f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(125f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(125f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(75f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(125f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(125f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(75f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_cross_min_height() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setMinHeightPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(2f);
        root_child1.setMinHeightPercent(10f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(140f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(140f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(140f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(140f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_main_max_height() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(10f);
        root_child0.setMaxHeightPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(10f);
        root_child1.setMaxHeightPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(52f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(52f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(148f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(148f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(52f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(148f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_cross_max_height() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(10f);
        root_child0.setMaxHeightPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(10f);
        root_child1.setMaxHeightPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(120f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(120f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_main_max_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(15f);
        root_child0.setMaxWidthPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(10f);
        root_child1.setMaxWidthPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(120f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(80f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(40f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_cross_max_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(10f);
        root_child0.setMaxWidthPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(15f);
        root_child1.setMaxWidthPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(50f, root_child1.getLayoutY(), 0.0f);
        assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(80f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(160f, root_child1.getLayoutX(), 0.0f);
        assertEquals(50f, root_child1.getLayoutY(), 0.0f);
        assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_main_min_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(15f);
        root_child0.setMinWidthPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(10f);
        root_child1.setMinWidthPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(120f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(80f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(80f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(80f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_flex_basis_cross_min_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(10f);
        root_child0.setMinWidthPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(15f);
        root_child1.setMinWidthPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(50f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(50f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_multiple_nested_with_padding_margin_and_percentage_values() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasisPercent(10f);
        root_child0.setMargin(YogaEdge.LEFT, 5f);
        root_child0.setMargin(YogaEdge.TOP, 5f);
        root_child0.setMargin(YogaEdge.RIGHT, 5f);
        root_child0.setMargin(YogaEdge.BOTTOM, 5f);
        root_child0.setPadding(YogaEdge.LEFT, 3);
        root_child0.setPadding(YogaEdge.TOP, 3);
        root_child0.setPadding(YogaEdge.RIGHT, 3);
        root_child0.setPadding(YogaEdge.BOTTOM, 3);
        root_child0.setMinWidthPercent(60f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setMargin(YogaEdge.LEFT, 5f);
        root_child0_child0.setMargin(YogaEdge.TOP, 5f);
        root_child0_child0.setMargin(YogaEdge.RIGHT, 5f);
        root_child0_child0.setMargin(YogaEdge.BOTTOM, 5f);
        root_child0_child0.setPaddingPercent(YogaEdge.LEFT, 3);
        root_child0_child0.setPaddingPercent(YogaEdge.TOP, 3);
        root_child0_child0.setPaddingPercent(YogaEdge.RIGHT, 3);
        root_child0_child0.setPaddingPercent(YogaEdge.BOTTOM, 3);
        root_child0_child0.setWidthPercent(50f);
        root_child0.addChildAt(root_child0_child0, 0);

        YogaNode root_child0_child0_child0 = createNode(config);
        root_child0_child0_child0.setMarginPercent(YogaEdge.LEFT, 5f);
        root_child0_child0_child0.setMarginPercent(YogaEdge.TOP, 5f);
        root_child0_child0_child0.setMarginPercent(YogaEdge.RIGHT, 5f);
        root_child0_child0_child0.setMarginPercent(YogaEdge.BOTTOM, 5f);
        root_child0_child0_child0.setPadding(YogaEdge.LEFT, 3);
        root_child0_child0_child0.setPadding(YogaEdge.TOP, 3);
        root_child0_child0_child0.setPadding(YogaEdge.RIGHT, 3);
        root_child0_child0_child0.setPadding(YogaEdge.BOTTOM, 3);
        root_child0_child0_child0.setWidthPercent(45f);
        root_child0_child0.addChildAt(root_child0_child0_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(4f);
        root_child1.setFlexBasisPercent(15f);
        root_child1.setMinWidthPercent(20f);
        root.addChildAt(root_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(5f, root_child0.getLayoutX(), 0.0f);
        assertEquals(5f, root_child0.getLayoutY(), 0.0f);
        assertEquals(190f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(48f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(8f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(8f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(92f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(10f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(10f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(36f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(6f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(58f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(142f, root_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(5f, root_child0.getLayoutX(), 0.0f);
        assertEquals(5f, root_child0.getLayoutY(), 0.0f);
        assertEquals(190f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(48f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(90f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(8f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(92f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(46f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(10f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(36f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(6f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(58f, root_child1.getLayoutY(), 0.0f);
        assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(142f, root_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_margin_should_calculate_based_only_on_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setMarginPercent(YogaEdge.LEFT, 10f);
        root_child0.setMarginPercent(YogaEdge.TOP, 10f);
        root_child0.setMarginPercent(YogaEdge.RIGHT, 10f);
        root_child0.setMarginPercent(YogaEdge.BOTTOM, 10f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidth(10f);
        root_child0_child0.setHeight(10f);
        root_child0.addChildAt(root_child0_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(20f, root_child0.getLayoutX(), 0.0f);
        assertEquals(20f, root_child0.getLayoutY(), 0.0f);
        assertEquals(160f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(20f, root_child0.getLayoutX(), 0.0f);
        assertEquals(20f, root_child0.getLayoutY(), 0.0f);
        assertEquals(160f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(150f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_padding_should_calculate_based_only_on_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setPaddingPercent(YogaEdge.LEFT, 10);
        root_child0.setPaddingPercent(YogaEdge.TOP, 10);
        root_child0.setPaddingPercent(YogaEdge.RIGHT, 10);
        root_child0.setPaddingPercent(YogaEdge.BOTTOM, 10);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidth(10f);
        root_child0_child0.setHeight(10f);
        root_child0.addChildAt(root_child0_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(20f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(20f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(170f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(20f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_absolute_position() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(200f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setPositionType(YogaPositionType.ABSOLUTE);
        root_child0.setPositionPercent(YogaEdge.LEFT, 30f);
        root_child0.setPositionPercent(YogaEdge.TOP, 10f);
        root_child0.setWidth(10f);
        root_child0.setHeight(10f);
        root.addChildAt(root_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(60f, root_child0.getLayoutX(), 0.0f);
        assertEquals(10f, root_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(60f, root_child0.getLayoutX(), 0.0f);
        assertEquals(10f, root_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_width_height_undefined_parent_size() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);

        YogaNode root_child0 = createNode(config);
        root_child0.setWidthPercent(50f);
        root_child0.setHeightPercent(50f);
        root.addChildAt(root_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(0f, root.getLayoutWidth(), 0.0f);
        assertEquals(0f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(0f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(0f, root.getLayoutWidth(), 0.0f);
        assertEquals(0f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(0f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percent_within_flex_grow() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(350f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setWidth(100f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 = createNode(config);
        root_child1_child0.setWidthPercent(100f);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child2 = createNode(config);
        root_child2.setWidth(100f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(350f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(100f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(150f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(150f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(250f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(350f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(250f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(100f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(150f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(150f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percentage_container_in_wrapping_container() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setJustifyContent(YogaJustify.CENTER);
        root.setAlignItems(YogaAlign.CENTER);
        root.setWidth(200f);
        root.setHeight(200f);

        YogaNode root_child0 = createNode(config);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setFlexDirection(YogaFlexDirection.ROW);
        root_child0_child0.setJustifyContent(YogaJustify.CENTER);
        root_child0_child0.setWidthPercent(100f);
        root_child0.addChildAt(root_child0_child0, 0);

        YogaNode root_child0_child0_child0 = createNode(config);
        root_child0_child0_child0.setWidth(50f);
        root_child0_child0_child0.setHeight(50f);
        root_child0_child0.addChildAt(root_child0_child0_child0, 0);

        YogaNode root_child0_child0_child1 = createNode(config);
        root_child0_child0_child1.setWidth(50f);
        root_child0_child0_child1.setHeight(50f);
        root_child0_child0.addChildAt(root_child0_child0_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(50f, root_child0.getLayoutX(), 0.0f);
        assertEquals(75f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(50f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(50f, root_child0_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child1.getLayoutY(), 0.0f);
        assertEquals(50f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(200f, root.getLayoutWidth(), 0.0f);
        assertEquals(200f, root.getLayoutHeight(), 0.0f);

        assertEquals(50f, root_child0.getLayoutX(), 0.0f);
        assertEquals(75f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(50f, root_child0_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
        assertEquals(50f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0_child1.getLayoutY(), 0.0f);
        assertEquals(50f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0_child1.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_percent_absolute_position() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(60f);
        root.setHeight(50f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexDirection(YogaFlexDirection.ROW);
        root_child0.setPositionType(YogaPositionType.ABSOLUTE);
        root_child0.setPositionPercent(YogaEdge.LEFT, 50f);
        root_child0.setWidthPercent(100f);
        root_child0.setHeight(50f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidthPercent(100f);
        root_child0.addChildAt(root_child0_child0, 0);

        YogaNode root_child0_child1 = createNode(config);
        root_child0_child1.setWidthPercent(100f);
        root_child0.addChildAt(root_child0_child1, 1);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(60f, root.getLayoutWidth(), 0.0f);
        assertEquals(50f, root.getLayoutHeight(), 0.0f);

        assertEquals(30f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(60f, root_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child1.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child1.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(60f, root.getLayoutWidth(), 0.0f);
        assertEquals(50f, root.getLayoutHeight(), 0.0f);

        assertEquals(30f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(-60f, root_child0_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child1.getLayoutY(), 0.0f);
        assertEquals(60f, root_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(50f, root_child0_child1.getLayoutHeight(), 0.0f);
    }

}
