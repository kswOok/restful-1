package com.sec.ax.restful.service;

/**
 * 
 * @author heesik.jeon
 *
 */

public interface NoteService {

	/**
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public Object getNotes(Object response) throws Exception;

	/**
	 * @param idx
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public Object getNote(int idx, Object response) throws Exception;

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public Object createNote(Object request, Object response) throws Exception;

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public Object updateNote(Object request, Object response) throws Exception;

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public Object deleteNote(Object request, Object response) throws Exception;
	
}