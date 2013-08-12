/**
 * 
 */
package com.gdggoma.locateme.android.model;

/**
 * @author Mishka
 *
 */
public class LocateMeObject {

	int version;
    boolean deleted;

    public LocateMeObject() {
    }

    public LocateMeObject(int version, boolean deleted) {
        this.version = version;
        this.deleted = deleted;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
	
}
