package edu.cg.models.Car;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import edu.cg.models.IRenderable;

public class PairOfWheels implements IRenderable {
	// TODO: Use the wheel field to render the two wheels.
	private final Wheel wheel = new Wheel();
	
	@Override
	public void render(GL2 gl) {
		GLU glu = new GLU();
		GLUquadric q = glu.gluNewQuadric();
		gl.glPushMatrix();
		gl.glTranslated(0,0, -Specification.PAIR_OF_WHEELS_ROD_DEPTH/ 2.0);
		Materials.setMaterialRims(gl);
		glu.gluCylinder(q, Specification.PAIR_OF_WHEELS_ROD_RADIUS , Specification.PAIR_OF_WHEELS_ROD_RADIUS, Specification.PAIR_OF_WHEELS_ROD_DEPTH, 30, 1);
		gl.glTranslated(0,0, - Specification.TIRE_DEPTH / 2.0);
		wheel.render(gl);
		gl.glTranslated(0,0, Specification.PAIR_OF_WHEELS_ROD_DEPTH + Specification.TIRE_DEPTH);
		wheel.render(gl);

		glu.gluDeleteQuadric(q);
		gl.glPopMatrix();
	}

	@Override
	public void init(GL2 gl) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "PairOfWheels";
	}

}
