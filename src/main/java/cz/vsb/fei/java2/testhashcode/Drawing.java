package cz.vsb.fei.java2.testhashcode;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawing {

	private String name;
	private List<Shape> shapes = new ArrayList<>();

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<>();

	public Drawing(String name) {
		this.name = name;
	}

	public void add(Shape shape) {
		shapes.add(shape);
		firePropertyChanged();
	}

	public boolean add(PropertyChangeListener listener) {
		return propertyChangeListeners.add(listener);
	}

	public boolean remove(PropertyChangeListener listener) {
		return propertyChangeListeners.remove(listener);
	}
	
	private void firePropertyChanged() {
		PropertyChangeEvent evt = new PropertyChangeEvent(this, "shapes", Collections.emptyList(), shapes);
		for (PropertyChangeListener propertyChangeListener : propertyChangeListeners) {
			propertyChangeListener.propertyChange(evt);
		}
	}
}
