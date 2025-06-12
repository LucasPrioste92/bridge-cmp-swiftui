//
//  TextViewStateObserver.swift
//  iosApp
//
//  Created by Lucas Prioste on 11/06/2025.
//

import ComposeApp

class TextViewStateObserver: ObservableObject {
    @Published var value: String = ""
    private var disposableHandle: DisposableHandle?
    
    func startObserving(flow: CommonFlow<NSString>) {
        guard disposableHandle == nil else { return }
        disposableHandle = flow.subscribe(onCollect: { newValue in
            self.value = (newValue ?? "") as String
        })
    }
    
    func stopObserving() {
        disposableHandle?.dispose()
        disposableHandle = nil
    }
    
    deinit {
        stopObserving()
    }
}
