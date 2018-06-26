function varargout = Calculadora_VS(varargin)
% CALCULADORA_VS MATLAB code for Calculadora_VS.fig
%      CALCULADORA_VS, by itself, creates a new CALCULADORA_VS or raises the existing
%      singleton*.
%
%      H = CALCULADORA_VS returns the handle to a new CALCULADORA_VS or the handle to
%      the existing singleton*.
%
%      CALCULADORA_VS('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in CALCULADORA_VS.M with the given input arguments.
%
%      CALCULADORA_VS('Property','Value',...) creates a new CALCULADORA_VS or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before Calculadora_VS_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to Calculadora_VS_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help Calculadora_VS

% Last Modified by GUIDE v2.5 10-Jul-2017 12:13:31

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @Calculadora_VS_OpeningFcn, ...
                   'gui_OutputFcn',  @Calculadora_VS_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before Calculadora_VS is made visible.
function Calculadora_VS_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to Calculadora_VS (see VARARGIN)

% Choose default command line output for Calculadora_VS
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes Calculadora_VS wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = Calculadora_VS_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in btnResolver.
function btnResolver_Callback(hObject, eventdata, handles)
% hObject    handle to btnResolver (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
a = sym('dy');
b = sym('dx');
x = sym('x');
ec = sym(get(handles.txtEcuacion, 'String'));
funcion = Char_Symbol1(ec, a, b); 
sat = strcat('Dy=', char(funcion));
res = dsolve(char(sat), x);
simplify(res);
simplifyFraction(res);
set(handles.txtResultado, 'string', char(res));




function txtEcuacion_Callback(hObject, eventdata, handles)
% hObject    handle to txtEcuacion (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of txtEcuacion as text
%        str2double(get(hObject,'String')) returns contents of txtEcuacion as a double


% --- Executes during object creation, after setting all properties.
function txtEcuacion_CreateFcn(hObject, eventdata, handles)
% hObject    handle to txtEcuacion (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function txtCondicion_Callback(hObject, eventdata, handles)
% hObject    handle to txtCondicion (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of txtCondicion as text
%        str2double(get(hObject,'String')) returns contents of txtCondicion as a double


% --- Executes during object creation, after setting all properties.
function txtCondicion_CreateFcn(hObject, eventdata, handles)
% hObject    handle to txtCondicion (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function txtResultado_Callback(hObject, eventdata, handles)
% hObject    handle to txtResultado (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of txtResultado as text
%        str2double(get(hObject,'String')) returns contents of txtResultado as a double


% --- Executes during object creation, after setting all properties.
function txtResultado_CreateFcn(hObject, eventdata, handles)
% hObject    handle to txtResultado (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function txtResCon_Callback(hObject, eventdata, handles)
% hObject    handle to txtResCon (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of txtResCon as text
%        str2double(get(hObject,'String')) returns contents of txtResCon as a double


% --- Executes during object creation, after setting all properties.
function txtResCon_CreateFcn(hObject, eventdata, handles)
% hObject    handle to txtResCon (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end
