package com.movie.booking.vo;


public class ShowResponseVo {

	private long showId;

	private MovieResponseVo movie;

	private ScreenResponseVo screen;

	private String showDate;

	private String showTime;

	public ShowResponseVo() {
		
	}
	public ShowResponseVo(long showId, MovieResponseVo movie, ScreenResponseVo screen, String showDate,
			String showTime) {
		super();
		this.showId = showId;
		this.movie = movie;
		this.screen = screen;
		this.showDate = showDate;
		this.showTime = showTime;
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public MovieResponseVo getMovie() {
		return movie;
	}

	public void setMovie(MovieResponseVo movie) {
		this.movie = movie;
	}

	public ScreenResponseVo getScreen() {
		return screen;
	}

	public void setScreen(ScreenResponseVo screen) {
		this.screen = screen;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	
}
