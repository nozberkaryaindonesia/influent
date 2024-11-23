/**
 * Copyright (c) 2013-2014 Oculus Info Inc.
 * http://www.oculusinfo.com/
 *
 * Released under the MIT License.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
define(
    [
        'jquery', 'lib/channels', 'lib/render/cardRenderer', 'lib/render/columnRenderer'
    ],
    function(
        $, chan, cardRenderer, columnRenderer
    ) {

        var workspaceRenderer = {};

        //------------------------------------------------------------------------------------------------------------------

        var _renderDefaults = {
            getWindowCenterX : function(childObjects){
                var centerBase =  $('#cards').width()/2-cardRenderer.getRenderDefaults().CARD_WIDTH/2;      // Subtract half of card size,

                if(childObjects.length > 1) {
                    centerBase = Math.max(0, centerBase - (childObjects.length - 1)*_columnDefaults.COLUMN_DISTANCE/2);
                }

                return centerBase;
            }
        };

        //------------------------------------------------------------------------------------------------------------------

        var _columnDefaults = columnRenderer.getRenderDefaults();

        //------------------------------------------------------------------------------------------------------------------

        var processColumns = function(childObjects, parentCanvas){
            for (var i=0; i < childObjects.length; i++){
                var visualInfo = childObjects[i].getVisualInfo();
                var element = columnRenderer.createElement(visualInfo);
                element.css('left', _renderDefaults.getWindowCenterX(childObjects) + _columnDefaults.COLUMN_DISTANCE*i);
                parentCanvas.append(element);
            }
        };

        //------------------------------------------------------------------------------------------------------------------


        workspaceRenderer.createElement = function(visualInfo){
            var canvas = $('#' + visualInfo.xfId);
            if (canvas.length > 0){
                canvas.empty();
            }
            else {
                canvas = $('<div></div>');
                canvas.attr('id', visualInfo.xfId);
            }

            processColumns(visualInfo.children, canvas);

            return canvas;
        };

        //------------------------------------------------------------------------------------------------------------------

        workspaceRenderer.getRenderDefaults = function(){
            return _.clone(_renderDefaults);
        };

        return workspaceRenderer;
    }
);