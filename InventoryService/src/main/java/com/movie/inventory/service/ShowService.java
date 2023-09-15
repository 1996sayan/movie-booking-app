package com.movie.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.inventory.exception.DatabaseException;
import com.movie.inventory.exception.RecordAlreadyExistsException;
import com.movie.inventory.exception.ShowNotFoundException;
import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowRequestVo;
import com.movie.inventory.vo.ShowResponseVo;

@Service
public interface ShowService {

	ResponseObject<ShowResponseVo> addShowDetails(ShowRequestVo request) throws DatabaseException,RecordAlreadyExistsException;

	ResponseObject<List<ShowResponseVo>> getAllShowDetails();

	ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId) throws ShowNotFoundException;
}
