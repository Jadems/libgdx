/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleInfoMap extends BulletBase {
	private long swigCPtr;
	
	protected btTriangleInfoMap(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btTriangleInfoMap(long cPtr, boolean cMemoryOwn) {
		this("btTriangleInfoMap", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleInfoMap obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTriangleInfoMap(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setConvexEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMap_convexEpsilon_set(swigCPtr, this, value);
  }

  public float getConvexEpsilon() {
    return gdxBulletJNI.btTriangleInfoMap_convexEpsilon_get(swigCPtr, this);
  }

  public void setPlanarEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMap_planarEpsilon_set(swigCPtr, this, value);
  }

  public float getPlanarEpsilon() {
    return gdxBulletJNI.btTriangleInfoMap_planarEpsilon_get(swigCPtr, this);
  }

  public void setEqualVertexThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_equalVertexThreshold_set(swigCPtr, this, value);
  }

  public float getEqualVertexThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_equalVertexThreshold_get(swigCPtr, this);
  }

  public void setEdgeDistanceThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_edgeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getEdgeDistanceThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_edgeDistanceThreshold_get(swigCPtr, this);
  }

  public void setMaxEdgeAngleThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_maxEdgeAngleThreshold_set(swigCPtr, this, value);
  }

  public float getMaxEdgeAngleThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_maxEdgeAngleThreshold_get(swigCPtr, this);
  }

  public void setZeroAreaThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_zeroAreaThreshold_set(swigCPtr, this, value);
  }

  public float getZeroAreaThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_zeroAreaThreshold_get(swigCPtr, this);
  }

  public btTriangleInfoMap() {
    this(gdxBulletJNI.new_btTriangleInfoMap(), true);
  }

  public int calculateSerializeBufferSize() {
    return gdxBulletJNI.btTriangleInfoMap_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btTriangleInfoMap_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void deSerialize(btTriangleInfoMapData data) {
    gdxBulletJNI.btTriangleInfoMap_deSerialize(swigCPtr, this, btTriangleInfoMapData.getCPtr(data), data);
  }

}
