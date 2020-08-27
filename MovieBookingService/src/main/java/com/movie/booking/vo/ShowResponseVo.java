package com.movie.booking.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShowResponseVo {

	private long showId;

	private MovieResponseVo movie;

	private ScreenResponseVo screen;

	private String showDate;

	private String showTime;
}
