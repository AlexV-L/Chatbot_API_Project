package rest.weather;

import com.google.gson.annotations.SerializedName;

public class Rain {
	@SerializedName("3h")
	private Double _3h;

	/*
	 * Default constructor
	 */
	public Rain() {
	}

	/*
	 * Value constructor
	 */
	public Rain(Double _3h) {
		this._3h = _3h;
	}

	/*
	 * Get method for 3h
	 */
	public Double get_3h() {
		return _3h;
	}

	/*
	 * Set method for 3h
	 */
	public void set_3h(Double _3h) {
		this._3h = _3h;
	}

	@Override
	public String toString() {
		return "Rain [_3h=" + _3h + "]";
	}

}
