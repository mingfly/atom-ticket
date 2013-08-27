/**
 * aBoy.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.github.obullxl.ticket;

import com.github.obullxl.ticket.api.TicketException;

/**
 * 票据
 * 
 * @author obullxl@gmail.com
 * @version $Id: TicketService.java, 2012-10-19 下午9:47:53 Exp $
 */
public interface TicketService {
    public static final String LOGGER = "atom-ticket-logger";

    /**
     * 取得序列下一个值
     */
    public long nextValue() throws TicketException;

}