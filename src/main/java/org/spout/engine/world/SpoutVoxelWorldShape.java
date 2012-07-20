package org.spout.engine.world;

import com.bulletphysics.collision.shapes.voxel.VoxelWorldShape;

/**
 * Represents the shape of a world of voxels. In Spout, regions are simulations and we
 * generate a shape for the region's voxels.
 */

//TODO Override methods as needed.
public class SpoutVoxelWorldShape extends VoxelWorldShape {
	private final SpoutRegion simulation;

	public SpoutVoxelWorldShape(SpoutRegion simulation) {
		super(simulation);
		this.simulation = simulation;
	}

	@Override
	public String getName() {
		return simulation.toString();
	}
}
