/*
 * This file is part of Spout.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * Spout is licensed under the SpoutDev License Version 1.
 *
 * Spout is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Spout is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.engine.world;

import javax.vecmath.Vector3f;

import com.bulletphysics.collision.shapes.CollisionShape;
import com.bulletphysics.collision.shapes.voxel.VoxelInfo;

import org.spout.api.geo.cuboid.Block;
import org.spout.api.material.Material;

/**
 * Represents the collision info of a specific voxel within a world
 */
public class SpoutVoxelInfo implements VoxelInfo {
	private final Material material;

	public SpoutVoxelInfo(Material material) {
		this.material = material;
	}

	public SpoutVoxelInfo(Block block) {
		this(block.getMaterial());
	}

	@Override
	public boolean isColliding() {
		return material.hasCollision();
	}

	@Override
	public Object getUserData() {
		return null; //TODO this
	}

	@Override
	public CollisionShape getCollisionShape() {
		return material.getCollisionShape();
	}

	@Override
	public Vector3f getCollisionOffset() {
		return null; //TODO this
	}

	@Override
	public boolean isBlocking() {
		return material.hasBodyCollision();
	}
}
