package edu.cg.models;

import com.jogamp.opengl.*;
import edu.cg.models.Car.Specification;

/**
 * A simple axes dummy
 *
 */
public class Empty implements IRenderable {
	private SkewedBox baseBox = new SkewedBox(0.1, 0.1,
			0.2, 0.1, 0.2);
	public void render(GL2 gl) {
		baseBox.render(gl);
	}

	@Override
	public String toString() {
		return "Empty";
	}

	@Override
	public void init(GL2 gl) {

	}
}
