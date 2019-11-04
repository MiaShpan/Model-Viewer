package edu.cg.models.Car;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import edu.cg.models.IRenderable;

public class Wheel implements IRenderable {

	@Override
	public void render(GL2 gl) {
		// TODO: Render the wheel. 
		// The wheel should be in the center relative to its local coordinate system.
//		Materials.setMaterialTire(gl);
//		gl.glPushMatrix();
//		gl.glTranslated(0,0, -Specification.TIRE_DEPTH / 2.0);
//		GLU glu = new GLU();
//		GLUquadric q = glu.gluNewQuadric();
//		glu.gluCylinder(q, Specification.TIRE_RADIUS , Specification.TIRE_RADIUS, Specification.TIRE_DEPTH, 30, 1);
//		glu.gluDisk(q,0, Specification.TIRE_RADIUS, 30, 1);
//		Materials.setMaterialRims(gl);
//		glu.gluDisk(q,0, Specification.DISK_OUTER_RADIUS, 30, 1);
//		gl.glRotated(180D, 1, 0, 0);
//		gl.glTranslated(0,0, -Specification.TIRE_DEPTH);
//		Materials.setMaterialTire(gl);
//		glu.gluDisk(q,0, Specification.TIRE_RADIUS, 30, 1);
//		Materials.setMaterialRims(gl);
//		glu.gluDisk(q,0, Specification.DISK_OUTER_RADIUS, 30, 1);
//		glu.gluDeleteQuadric(q);
//		gl.glPopMatrix();

		GLU glu = new GLU();
		GLUquadric q = glu.gluNewQuadric();
		Materials.setMaterialTire(gl);
		gl.glPushMatrix();
		gl.glTranslated(0,0, -Specification.TIRE_DEPTH / 2.0);
		glu.gluCylinder(q, Specification.TIRE_RADIUS , Specification.TIRE_RADIUS, Specification.TIRE_DEPTH, 30, 1);
		gl.glRotated(180D, 1, 0, 0);
		Materials.setMaterialRims(gl);
		glu.gluDisk(q,0, Specification.DISK_OUTER_RADIUS, 30, 1);
		Materials.setMaterialTire(gl);
		glu.gluDisk(q,0, Specification.TIRE_RADIUS, 30, 1);
		gl.glRotated(180D, 1, 0, 0);
		gl.glTranslated(0,0, Specification.TIRE_DEPTH);
		Materials.setMaterialRims(gl);
		glu.gluDisk(q,0, Specification.DISK_OUTER_RADIUS, 30, 1);
		Materials.setMaterialTire(gl);
		glu.gluDisk(q,0, Specification.TIRE_RADIUS, 30, 1);
		gl.glPopMatrix();
		glu.gluDeleteQuadric(q);



	}

	@Override
	public void init(GL2 gl) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Wheel";
	}

}
