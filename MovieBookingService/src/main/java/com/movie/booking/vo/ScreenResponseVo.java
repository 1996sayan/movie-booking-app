package com.movie.booking.vo;

import java.util.List;

import lombok.Data;

@Data
public class ScreenResponseVo {

	public long screenId;

	private List<SeatResponseVo> seatList;

	private TheatreResponseVo theatre;
}
