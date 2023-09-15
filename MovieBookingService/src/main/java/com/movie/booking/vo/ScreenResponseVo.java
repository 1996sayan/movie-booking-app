package com.movie.booking.vo;

import java.util.List;


public class ScreenResponseVo {

	public long screenId;

	private List<SeatResponseVo> seatList;

	private TheatreResponseVo theatre;

	public ScreenResponseVo() {
		
	}
	public ScreenResponseVo(long screenId, List<SeatResponseVo> seatList, TheatreResponseVo theatre) {
		super();
		this.screenId = screenId;
		this.seatList = seatList;
		this.theatre = theatre;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public List<SeatResponseVo> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<SeatResponseVo> seatList) {
		this.seatList = seatList;
	}

	public TheatreResponseVo getTheatre() {
		return theatre;
	}

	public void setTheatre(TheatreResponseVo theatre) {
		this.theatre = theatre;
	}
	
}
