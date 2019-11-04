package edu.cg.models.Car;

import com.jogamp.opengl.*;

import edu.cg.models.IRenderable;

/**
 * A F1 Racing Car.
 *
 */
public class F1Car implements IRenderable {

	@Override
	public void render(GL2 gl) {
		// TODO: Render the whole car. 
		//       Here You should only render the three parts: back, center and front.

		new Center().render(gl);
		gl.glPushMatrix();
		gl.glTranslated(Specification.C_BASE_LENGTH/2 + Specification.F_HOOD_LENGTH_1 ,0,0);
		new Front().render(gl);
		gl.glPopMatrix();
		gl.glTranslated(-Specification.B_LENGTH/2 ,0,0);
		new Back().render(gl);

	}

	@Override
	public String toString() {
		return "F1Car";
	}

	@Override
	public void init(GL2 gl) {

	}
}
