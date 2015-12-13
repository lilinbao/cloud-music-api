/**
 * Dec 14, 2015
 *cloud-music-api
 *TODO
 *Linbao
 */
package com.linbao.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.linbao.api.model.Music;
import com.linbao.dao.IMusicDao;
import com.linbao.service.IMusicService;

/**
 * @author Linbao
 *
 */
public class MusicServiceImpl implements IMusicService {

	IMusicDao musicDao;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#getById(int)
	 */
	@Override
	public Music getById(final int id) throws Exception {

		return musicDao.getById(id);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#getByProperty(java.util.Map, int,
	 *      int, boolean)
	 */
	@Override
	public List<Music> getByProperty(final Map<String, String> obj, final int page, final int pageSize,
			final boolean isFuzzy) throws Exception {

		return musicDao.getByProperty(obj, page, pageSize, isFuzzy);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#getAll()
	 */
	@Override
	public List<Music> getAll() throws Exception {

		return musicDao.getAll();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#add(com.linbao.api.model.Music)
	 */
	@Override
	public int add(final Music music) throws SQLException, NumberFormatException, NullPointerException {

		return musicDao.add(music);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#update(com.linbao.api.model.Music)
	 */
	@Override
	public int update(final Music music) throws SQLException, NullPointerException {

		return musicDao.update(music);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.linbao.service.IMusicService#delete(com.linbao.api.model.Music)
	 */
	@Override
	public int delete(final Music music) throws SQLException, NumberFormatException {

		return musicDao.delete(music);
	}

	public IMusicDao getMusicDao() {
		return musicDao;
	}

	public void setMusicDao(IMusicDao musicDao) {
		this.musicDao = musicDao;
	}

}
